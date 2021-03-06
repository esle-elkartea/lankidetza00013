package net.idtoki.aveobras.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.idtoki.aveobras.group.CapitulosGroupBean;
import net.idtoki.aveobras.helper.CapitulosHelper;
import net.idtoki.aveobras.helper.SubcapitulosHelper;
import net.idtoki.aveobras.manager.CapitulosManager;
import net.zylk.tools.ajax.AjaxUtils;
import net.zylk.tools.ajax.AjaxUtils.DinamicGridBean;
import net.zylk.torque.TorqueUtils;
import net.zylk.web.WebUtils;

import org.apache.torque.util.Criteria;

/**
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Wed Apr 19 12:33:52 CEST 2006]
 *
 *  You should add additional methods to this class to meet the
 *  application requirements.  This class will only be generated as
 *  long as it does not already exist in the output directory.
 */
public class CapitulosController
    extends net.idtoki.aveobras.controller.BaseCapitulosController
{
 private static final Logger logger = Logger.getLogger("net.idtoki.aveobras.controller.CapitulosController");

 public void init()
 {
  super.init();
  //Aqui se registran los metodos que no se quieran repetir de otros sitios.
  //por ejemplo igual quieres tener los metodos de generacion de ajax
  // en un paquete aparte y no copiarlos por aqui,  sino tenerlos disponibles
  //para todas las aplicaciones sin repetirlos en todos los sitios, pues los registras
  //y punto!!
 }
 
 private Criteria ordenacion(Criteria c,String CampoOrdenacion,String OrdenOrdenacion) 
 { 
 	if((OrdenOrdenacion != null )&& (OrdenOrdenacion.compareTo("ASC")==0))
 		if ((CampoOrdenacion != null)) //&& (CampoOrdenacion.compareTo("nombre")==0))
 		{
 			//c.clear();
 			c.addAscendingOrderByColumn(CampoOrdenacion.toString());
 		}
 	if  ((OrdenOrdenacion != null) && (OrdenOrdenacion.compareTo("DESC")==0))
 		if ((CampoOrdenacion != null)) //&& (CampoOrdenacion.compareTo("nombre")==0))
 			{
 			//c.clear();
 			c.addDescendingOrderByColumn(CampoOrdenacion.toString());
 		}
 	return c;
 }

 private Criteria criteriaCapitulosTableContent(HttpServletRequest request,Criteria c) throws IOException, ServletException
 { 
 	  String paramSortCol =  WebUtils.getStringParam(request, "sort_col");
 	  String paramSortDir =  WebUtils.getStringParam(request, "sort_dir");
 	  //System.out.println("----query:"+paramQuery+"----col:"+paramSortCol+"----dir:"+paramSortDir+"----filtro:"+paramFiltro);
 	  c = ordenacion(c,paramSortCol,paramSortDir);

 	  return c;
 } 
 
 public void serviceCapitulosTableContent(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
	 utf8RequestService(request);
	 int numElemPedidosBD = 40;
	 int gap = 0;//gap = viewedRows - numElemVisiblesUltPag	  
	 DinamicGridBean dgb = WebUtils.getDinamicGridBeanParam(request,numElemPedidosBD,gap); 
	 Criteria c =CapitulosManager.buildSearchCriteria(dgb); 
	 c =criteriaCapitulosTableContent(request,c);
	  
  CapitulosGroupBean tgb = CapitulosManager.getCapituloss(c);
  dgb.setTotalSize(tgb.getTotalSize());
  

  String[] methodos= new String[] {	
		  CapitulosHelper.NOMBRE_GET_METHOD_NAME+"CapitulosParsed",
		  CapitulosHelper.IDCAPITULO_GET_METHOD_NAME+"CapitulosParsed",
			};
  
  xmlResponseService(response,AjaxUtils.buildXmlAjaxResponseTableContentFromListObj(
		  										tgb.getAlmacen(),
		  										methodos,
		  										CapitulosHelper.IDCAPITULO_GET_METHOD_NAME, dgb,"ISO-8859-1"));
 }
 
 public void serviceCapitulosUlContent(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
	 utf8RequestService(request);
	 String[] methodos= new String[] {CapitulosHelper.IDCAPITULO_GET_METHOD_NAME,CapitulosHelper.NOMBRE_GET_METHOD_NAME};
	 String param =  WebUtils.getStringParam(request, "value");
	 
	 if(param==null || param.length() <= 0)
		 param =  WebUtils.getStringParam(request, new SubcapitulosHelper().getIdcapituloName());
	 
	 CapitulosGroupBean mgb = CapitulosManager.getCapituloss(CapitulosManager.buildSearchCriteria(param));
	 simpleResponseService(response, AjaxUtils.buildAjaxULContentFromListObj(mgb.getAlmacen(),methodos, CapitulosHelper.COMPLEX_ID_GET_METHOD,"Capitulos"));
 }  
}


