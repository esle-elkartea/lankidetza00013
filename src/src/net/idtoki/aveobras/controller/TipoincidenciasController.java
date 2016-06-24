package net.idtoki.aveobras.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.torque.TorqueException;
import org.apache.torque.util.Criteria;

import net.idtoki.aveobras.group.TipoincidenciasGroupBean;
import net.idtoki.aveobras.helper.IncidenciasHelper;
import net.idtoki.aveobras.helper.TipoincidenciasHelper;
import net.idtoki.aveobras.manager.TipoincidenciasManager;
import net.idtoki.aveobras.model.Tipoincidencias;
import net.idtoki.aveobras.model.TipoincidenciasPeer;
import net.zylk.tools.ajax.AjaxUtils;
import net.zylk.tools.ajax.AjaxUtils.DinamicGridBean;
import net.zylk.tools.xml.XmlUtils;
import net.zylk.web.WebUtils;

/**
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Wed Apr 19 12:33:52 CEST 2006]
 *
 *  You should add additional methods to this class to meet the
 *  application requirements.  This class will only be generated as
 *  long as it does not already exist in the output directory.
 */
public class TipoincidenciasController
    extends net.idtoki.aveobras.controller.BaseTipoincidenciasController
{
 private static final Logger logger = Logger.getLogger("net.idtoki.aveobras.controller.TipoincidenciasController");

 public void init()
 {
  super.init();
  //Aqui se registran los metodos que no se quieran repetir de otros sitios.
  //por ejemplo igual quieres tener los metodos de generacion de ajax
  // en un paquete aparte y no copiarlos por aqui,  sino tenerlos disponibles
  //para todas las aplicaciones sin repetirlos en todos los sitios, pues los registras
  //y punto!!
 }
 public void serviceAddTipoincidencias(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
		//recojo los parametros del formulario y doy de alta un nuevo Cliente
	 try
	 {
		 utf8RequestService(request);
		 Tipoincidencias ti = TipoincidenciasHelper.createObj(request);
		 TipoincidenciasGroupBean tigb = new TipoincidenciasGroupBean();
		 tigb.setElemento(ti);
		 tigb.save();
	 }
	 catch(TorqueException te)
	 {
		 response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	 }
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

 private Criteria criteriaTipoincidenciasTableContent(HttpServletRequest request,Criteria c) throws IOException, ServletException
 {
 	  String paramSortCol =  WebUtils.getStringParam(request, "sort_col");
 	  String paramSortDir =  WebUtils.getStringParam(request, "sort_dir");
 	  //System.out.println("----query:"+paramQuery+"----col:"+paramSortCol+"----dir:"+paramSortDir+"----filtro:"+paramFiltro);
 	  c = ordenacion(c,paramSortCol,paramSortDir);

 	  return c;
 }  
 
 public void  serviceTipoincidenciasTableContent(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
	 utf8RequestService(request);
	 int numElemPedidosBD = 40;
	 int gap = 0;//gap = viewedRows - numElemVisiblesUltPag	  
	 DinamicGridBean dgb = WebUtils.getDinamicGridBeanParam(request,numElemPedidosBD,gap); 
	 Criteria c =TipoincidenciasManager.buildSearchCriteria(dgb); 
	 c =criteriaTipoincidenciasTableContent(request,c);
	 
	 TipoincidenciasGroupBean tigb = TipoincidenciasManager.getTipoincidenciass(c);
	 dgb.setTotalSize(tigb.getTotalSize());
	  
	 String[] methodos= new String[] {
			 TipoincidenciasHelper.REFERENCIA_GET_METHOD_NAME+"TipoincidenciasParsed",
			 TipoincidenciasHelper.DESCRIPCION_GET_METHOD_NAME+"TipoincidenciasParsed",
				"getEditTipoincidencias",
				"getDeleteTipoincidencias"
				};
	  
	 xmlResponseService(response,AjaxUtils.buildXmlAjaxResponseTableContentFromListObj(
			  										tigb.getAlmacen(),
			  										methodos,
			  										TipoincidenciasHelper.IDTIPOINCIDENCIA_GET_METHOD_NAME, dgb,"ISO-8859-1")); 
 }
 
 protected StringBuffer updateReferenciaResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(TipoincidenciasManager.getTipoincidencias(Integer.parseInt(a.get(0).toString())).getReferenciaTipoincidenciasParsed());
   }
 
 protected StringBuffer updateDescripcionResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(TipoincidenciasManager.getTipoincidencias(Integer.parseInt(a.get(0).toString())).getDescripcionTipoincidenciasParsed());
   } 

 public void serviceDeleteTipoincidencias(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
	 int idBorrar=-1;
	 idBorrar=WebUtils.getintParam(request, "borrarId");
	 if (idBorrar!=-1)
		 if (TipoincidenciasManager.borraTipoincidencias(idBorrar))
			 WebUtils.writeXmlResponse(response,XmlUtils.buildXmlOKResponse("ISO-8859-1"));
		 else
			 WebUtils.writeXmlResponse(response,XmlUtils.buildXmlNotOKResponse("ISO-8859-1"));			 
 } 
 
 public void serviceTipoincidenciasElement(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  StringBuffer cadena=null;
  Criteria c= new Criteria();
  int claveId=-1;
  claveId=WebUtils.getintParam(request, "tipoincidencias.IDTIPOINCIDENCIA");
  if (claveId!=-1)
  {
	  c.add(TipoincidenciasPeer.IDTIPOINCIDENCIA, claveId);
  }
  c.addAscendingOrderByColumn(TipoincidenciasPeer.IDTIPOINCIDENCIA);
  TipoincidenciasGroupBean tigb = TipoincidenciasManager.getTipoincidenciass(c);
  
  if (tigb.getTotalSize()!=0)
  {
	  String [] parametros={
			  TipoincidenciasHelper.IDTIPOINCIDENCIA_GET_METHOD_NAME,
			  TipoincidenciasHelper.REFERENCIA_GET_METHOD_NAME+"TipoincidenciasParsed",
			  TipoincidenciasHelper.DESCRIPCION_GET_METHOD_NAME+"TipoincidenciasParsed"
	  			};
	  cadena=tigb.buildXml(parametros,null,"ISO-8859-1");
  }
  xmlResponseService(response, cadena);
 } 
 
 public void serviceTipoincidenciasUlContent(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
	 utf8RequestService(request);
	 String[] methodos= new String[] {
			 TipoincidenciasHelper.IDTIPOINCIDENCIA_GET_METHOD_NAME,
			 TipoincidenciasHelper.DESCRIPCION_GET_METHOD_NAME};
	 
	 String param =  WebUtils.getStringParam(request, "value");
	 	 if(param==null || param.length() <= 0)
		 param =  WebUtils.getStringParam(request, new IncidenciasHelper().getIdtipoincidenciaName());
	 TipoincidenciasGroupBean mgb = TipoincidenciasManager.getTipoincidenciass(TipoincidenciasManager.buildSearchCriteria(param));
	 simpleResponseService(response, AjaxUtils.buildAjaxULContentFromListObj(mgb.getAlmacen(),methodos, TipoincidenciasHelper.COMPLEX_ID_GET_METHOD,"Tipoincidencias"));
 }   
}


