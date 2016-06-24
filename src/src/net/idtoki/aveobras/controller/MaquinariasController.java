package net.idtoki.aveobras.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;

import net.idtoki.aveobras.group.MaquinariasGroupBean;
import net.idtoki.aveobras.helper.IncidenciasHelper;
import net.idtoki.aveobras.helper.MaquinariasHelper;
import net.idtoki.aveobras.helper.PartesHelper;
import net.idtoki.aveobras.manager.MaquinariasManager;
import net.idtoki.aveobras.model.Maquinarias;
import net.idtoki.aveobras.model.MaquinariasPeer;
import net.zylk.tools.ajax.AjaxUtils;
import net.zylk.tools.ajax.AjaxUtils.DinamicGridBean;
import net.zylk.tools.format.FormatUtils;
import net.zylk.tools.pdf.PdfUtils;
import net.zylk.tools.xml.XmlUtils;
import net.zylk.web.WebUtils;

import org.apache.torque.TorqueException;
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
public class MaquinariasController
    extends net.idtoki.aveobras.controller.BaseMaquinariasController
{
 private static final Logger logger = Logger.getLogger("net.idtoki.aveobras.controller.MaquinariasController");
 private TransformerFactory tFactory = TransformerFactory.newInstance();
 private Transformer maquinaria_transformer = null; 
 private Transformer maquinarias_transformer = null;    

 public void init(ServletConfig config)
 {
  super.init();
  ResourceBundle resource = ResourceBundle.getBundle("net/idtoki/aveobras/app/config/app-config");
  ServletContext context = config.getServletContext();
  File maquinaria = new File(resource.getString("app.xsl.templates.dir")+"/PdfMaquinaria.xslt");
  Source xslSource = new StreamSource(maquinaria);
  File maquinarias = new File(resource.getString("app.xsl.templates.dir")+"/PdfListaMaquinaria.xslt");
  Source xslSourceT = new StreamSource(maquinarias); 	  
  try{
	  maquinaria_transformer = tFactory.newTransformer(xslSource);
	  maquinarias_transformer = tFactory.newTransformer(xslSourceT);
  }catch (Exception e){
    e.printStackTrace();
  }  
 }
 
 public void serviceAddMaquinarias(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
		//recojo los parametros del formulario y doy de alta un nuevo Cliente
	 try
	 {
		 utf8RequestService(request);
		 Maquinarias ma = MaquinariasHelper.createObj(request);
		 MaquinariasGroupBean magb = new MaquinariasGroupBean();
		 ma.setFechaalta(FormatUtils.ddmmaaaa2aaaammdd(ma.getFechaalta(),"-",""));
		 ma.setFechabaja(FormatUtils.ddmmaaaa2aaaammdd(ma.getFechabaja(),"-",""));
		 if (ma.getCoste()==-1)
			 ma.setCoste(0);
		 magb.setElemento(ma);
		 magb.save();
	 }
	 catch(TorqueException te)
	 {
		 response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	 }
 }
 
 public StringBuffer replaceStringBuffer (StringBuffer strBA, String strOrigen, String strDestino) 
 {
	 return new StringBuffer(strBA.toString().replaceAll(strOrigen,strDestino));
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

 private Criteria filtro(Criteria c,int filtro) 
 { 
 	String cadena = null;
 	 switch (filtro)
 	 {
 	 case 1:
		  //Operarios en Activo
		  c.add(MaquinariasPeer.FECHABAJA,(Object)cadena,Criteria.ISNULL);
 		  break;
 	 case 2:
		  //Operarios dados de baja
		  c.add(MaquinariasPeer.FECHABAJA,(Object)cadena,Criteria.ISNOTNULL);
 		  break;
 	 default:
 		 //todas las obras
 		 break;
 	 }
 	return c;
 }
 private Criteria criteriaMaquinariasTableContent(HttpServletRequest request,Criteria c) throws IOException, ServletException
 { 
 	  String paramSortCol =  WebUtils.getStringParam(request, "sort_col");
 	  String paramSortDir =  WebUtils.getStringParam(request, "sort_dir");
	  int paramFiltro =  WebUtils.getintParam(request, "filtro");
 	  //System.out.println("----query:"+paramQuery+"----col:"+paramSortCol+"----dir:"+paramSortDir+"----filtro:"+paramFiltro);
	  c = filtro(c,paramFiltro);
 	  c = ordenacion(c,paramSortCol,paramSortDir);

 	  return c;
 } 
 
 public void  serviceMaquinariasTableContent(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
	 utf8RequestService(request);
	 int numElemPedidosBD = 40;
	 int gap = 0;//gap = viewedRows - numElemVisiblesUltPag	  
	 DinamicGridBean dgb = WebUtils.getDinamicGridBeanParam(request,numElemPedidosBD,gap); 
	 Criteria c =MaquinariasManager.buildSearchCriteria(dgb); 
	 c =criteriaMaquinariasTableContent(request,c);	 

	 MaquinariasGroupBean cgb = MaquinariasManager.getMaquinariass(c);
	 dgb.setTotalSize(cgb.getTotalSize());
	  
	 String[] methodos= new String[] {
//			 MaquinariasHelper.BASTIDOR_GET_METHOD_NAME+"MaquinariasParsed",
			 MaquinariasHelper.REFERENCIA_GET_METHOD_NAME+"MaquinariasParsed",
			 MaquinariasHelper.MATRICULA_GET_METHOD_NAME+"MaquinariasParsed",
			 MaquinariasHelper.NOMBRE_GET_METHOD_NAME+"MaquinariasParsed",
// 		     MaquinariasHelper.FECHAALTA_GET_METHOD_NAME+"MaquinariasParsed",
//			 MaquinariasHelper.FECHABAJA_GET_METHOD_NAME+"MaquinariasParsed",
//			 MaquinariasHelper.RESPONSABLE_GET_METHOD_NAME+"MaquinariasParsed",
//			 MaquinariasHelper.COSTE_GET_METHOD_NAME+"MaquinariasParsed",
			 MaquinariasHelper.MODELO_GET_METHOD_NAME+"MaquinariasParsed",
//			 MaquinariasHelper.MARCA_GET_METHOD_NAME+"MaquinariasParsed",
			 MaquinariasHelper.TIPO_GET_METHOD_NAME+"MaquinariasParsed",
			 MaquinariasHelper.ALQUILADO_GET_METHOD_NAME+"MaquinariasParsed2",
				"getEditMaquinarias",
				"getDeleteMaquinarias"
				};
	  
	 xmlResponseService(response,AjaxUtils.buildXmlAjaxResponseTableContentFromListObj(
			  										cgb.getAlmacen(),
			  										methodos,
			  										MaquinariasHelper.IDMAQUINARIA_GET_METHOD_NAME, dgb,"ISO-8859-1")); 
 }
 
 public void serviceMaquinariasUlContent(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
	 utf8RequestService(request);
	 String[] methodos= new String[] {
			 MaquinariasHelper.IDMAQUINARIA_GET_METHOD_NAME,
			 MaquinariasHelper.MATRICULA_GET_METHOD_NAME,
			 MaquinariasHelper.NOMBRE_GET_METHOD_NAME
	 };
	 String param =  WebUtils.getStringParam(request, "value");
	 if(param==null || param.length() <= 0)
			 param =  WebUtils.getStringParam(request, new PartesHelper().getIdmaquinariaName());
	 if(param==null || param.length() <= 0)
		 param =  WebUtils.getStringParam(request, new IncidenciasHelper().getIdmaquinariaName());	 
	 MaquinariasGroupBean cgb = MaquinariasManager.getMaquinariass(MaquinariasManager.buildSearchCriteria(param));
	 simpleResponseService(response, AjaxUtils.buildAjaxULContentFromListObj(cgb.getAlmacen(),methodos, MaquinariasHelper.COMPLEX_ID_GET_METHOD,"Maquinarias"));
 }
  
 
 public void serviceDeleteMaquinarias(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
	 int idBorrar=-1;
	 idBorrar=WebUtils.getintParam(request, "borrarId");
	 if (idBorrar!=-1)
		 if (MaquinariasManager.borraMaquinarias(idBorrar))
			 WebUtils.writeXmlResponse(response,XmlUtils.buildXmlOKResponse("ISO-8859-1"));
		 else
			 WebUtils.writeXmlResponse(response,XmlUtils.buildXmlNotOKResponse("ISO-8859-1"));			 
 } 
 
 protected StringBuffer updateReferenciaResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(MaquinariasManager.getMaquinarias(Integer.parseInt(a.get(0).toString())).getReferenciaMaquinariasParsed());
   }  
 
 protected StringBuffer updateMatriculaResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(MaquinariasManager.getMaquinarias(Integer.parseInt(a.get(0).toString())).getMatriculaMaquinariasParsed());
   }  
 
 protected StringBuffer updateNombreResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(MaquinariasManager.getMaquinarias(Integer.parseInt(a.get(0).toString())).getNombreMaquinariasParsed());
   }  
 
 protected StringBuffer updateModeloResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(MaquinariasManager.getMaquinarias(Integer.parseInt(a.get(0).toString())).getModeloMaquinariasParsed());
   }  
 
 protected StringBuffer updateTipoResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(MaquinariasManager.getMaquinarias(Integer.parseInt(a.get(0).toString())).getTipoMaquinariasParsed());
   }   
 
 protected StringBuffer updateAlquiladoResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(MaquinariasManager.getMaquinarias(Integer.parseInt(a.get(0).toString())).getAlquiladoMaquinariasParsed());
   }   
 
 public void serviceMaquinariasElement(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  StringBuffer cadena=null;
  Criteria c= new Criteria();
  int claveId=-1;
  claveId=WebUtils.getintParam(request, "maquinarias.IDMAQUINARIA");
  if (claveId!=-1)
  {
	  c.add(MaquinariasPeer.IDMAQUINARIA, claveId);
  }
  c.addAscendingOrderByColumn(MaquinariasPeer.IDMAQUINARIA);
  MaquinariasGroupBean trgb = MaquinariasManager.getMaquinariass(c);
  
  if (trgb.getTotalSize()!=0)
  {
	  String [] parametros={
			  MaquinariasHelper.IDMAQUINARIA_GET_METHOD_NAME,
				 MaquinariasHelper.NOMBRE_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.MATRICULA_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.BASTIDOR_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.REFERENCIA_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.FECHAALTA_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.FECHABAJA_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.RESPONSABLE_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.COSTE_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.MODELO_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.MARCA_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.TIPO_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.ALQUILADO_GET_METHOD_NAME+"MaquinariasParsed"	  
	  			};
	  cadena=trgb.buildXml(parametros,null,"ISO-8859-1");
  }
  xmlResponseService(response, cadena);
 } 
  
 public void serviceGetMaquinariasDetallePdf(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
	 utf8RequestService(request);
	 String[] getMethodos= new String[] {
			  MaquinariasHelper.IDMAQUINARIA_GET_METHOD_NAME,
				 MaquinariasHelper.NOMBRE_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.MATRICULA_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.BASTIDOR_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.REFERENCIA_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.FECHAALTA_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.FECHABAJA_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.RESPONSABLE_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.COSTE_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.MODELO_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.MARCA_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.TIPO_GET_METHOD_NAME+"MaquinariasParsed",
				 MaquinariasHelper.ALQUILADO_GET_METHOD_NAME+"MaquinariasParsed2"
			 };
	  
	 
	 MaquinariasGroupBean tgb = new MaquinariasGroupBean();
	 try
	{
		tgb.setElemento(MaquinariasHelper.getMaquinarias(request));
	} catch (TorqueException e)
	{
		logger.severe(e.getMessage());
	}
	
	 byte[] content =  PdfUtils.getBytes(replaceStringBuffer(tgb.buildXml(getMethodos, null,"ISO-8859-1"),"n/a"," "), maquinaria_transformer,"ISO-8859-1");
	   response.addHeader("content-disposition","attachment;filename=maquinariaDetalle.pdf");
	   response.setContentType("application/pdf");
	   response.setHeader("Cache-Control", "");//para que funcione en IE
	   response.setContentLength(content.length);
	   response.getOutputStream().write(content);
	   response.getOutputStream().flush();  
	   response.getOutputStream().close();
	
 }  
 
 public void serviceMaquinariasTableContentPdf(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
	 utf8RequestService(request);
	  Criteria c= new Criteria();
	  String paramQuery =  WebUtils.getStringParam(request, "query");
	  if ((paramQuery != null)&& (paramQuery.compareTo("")!=0) )
		  c = MaquinariasManager.buildSearchCriteria(paramQuery);   
	  c =criteriaMaquinariasTableContent(request,c);
 
  MaquinariasGroupBean tgb = MaquinariasManager.getMaquinariass(c);
  
  String[] methodos= new String[] {	
			 MaquinariasHelper.REFERENCIA_GET_METHOD_NAME+"MaquinariasParsed",
			 MaquinariasHelper.NOMBRE_GET_METHOD_NAME+"MaquinariasParsed",
			 MaquinariasHelper.MATRICULA_GET_METHOD_NAME+"MaquinariasParsed",
//			 MaquinariasHelper.FECHAALTA_GET_METHOD_NAME+"MaquinariasParsed",
//			 MaquinariasHelper.FECHABAJA_GET_METHOD_NAME+"MaquinariasParsed",
//			 MaquinariasHelper.RESPONSABLE_GET_METHOD_NAME+"MaquinariasParsed",
//			 MaquinariasHelper.COSTE_GET_METHOD_NAME+"MaquinariasParsed",
			 MaquinariasHelper.MODELO_GET_METHOD_NAME+"MaquinariasParsed",
//			 MaquinariasHelper.MARCA_GET_METHOD_NAME+"MaquinariasParsed",
			 MaquinariasHelper.TIPO_GET_METHOD_NAME+"MaquinariasParsed",
			 MaquinariasHelper.ALQUILADO_GET_METHOD_NAME+"MaquinariasParsed2"
			};
  
	 byte[] content =  PdfUtils.getBytes(replaceStringBuffer(tgb.buildXml(methodos, null,"ISO-8859-1"),"n/a"," "), maquinarias_transformer,"ISO-8859-1");
	   response.addHeader("content-disposition","attachment;filename=ListaMaquinaria.pdf");
	   response.setContentType("application/pdf");
	   response.setHeader("Cache-Control", "");//para que funcione en IE
	   response.setContentLength(content.length);
	   response.getOutputStream().write(content);
	   response.getOutputStream().flush();  
	   response.getOutputStream().close();

 } 
 
}


