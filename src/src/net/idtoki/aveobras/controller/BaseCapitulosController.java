package net.idtoki.aveobras.controller;

import java.io.IOException;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.zylk.tools.format.FormatUtils;
import net.zylk.web.WebUtils;
import java.util.ArrayList;
import net.zylk.tools.ajax.AjaxUtils;

import net.idtoki.aveobras.manager.CapitulosManager;
import net.idtoki.aveobras.helper.CapitulosHelper;

/**
 * This class was autogenerated by Torque on:
 *
 * [Wed Oct 25 17:01:04 CEST 2006]
 *
 */
public abstract class BaseCapitulosController extends AppController
{
 private static final Logger logger = Logger.getLogger("net.idtoki.aveobras.controller.BaseCapitulosController");
 protected static final String UPDATE_PRIMARY_KEY_FORM_NAME = "primaryKeyId";
 protected static final String UPDATE_VALUE_FORM_NAME = "value";


        	
  	            
 public void serviceUpdateIdcapitulo(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ACTUALIZAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  logger.finest("Nombre A ACTUALIZAR: "+WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   CapitulosManager.updateIdcapitulo(
     					   Integer.parseInt(a.get(0).toString()),
   					 updateIdcapituloRequestCallBack(WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME))
   					);
  				simpleResponseService(response, updateIdcapituloResponseCallBack(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME)));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido actualizar el valor"+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 protected StringBuffer updateIdcapituloResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(Integer.toString(CapitulosManager.getCapitulos(  Integer.parseInt(a.get(0).toString())).getIdcapitulo()));
   }

 protected String updateIdcapituloRequestCallBack(String value)
 {
  return value;
  }
 public void serviceUpdateNombre(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ACTUALIZAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  logger.finest("Nombre A ACTUALIZAR: "+WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   CapitulosManager.updateNombre(
     					   Integer.parseInt(a.get(0).toString()),
   					 updateNombreRequestCallBack(WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME))
   					);
  				simpleResponseService(response, updateNombreResponseCallBack(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME)));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido actualizar el valor"+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 protected StringBuffer updateNombreResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(CapitulosManager.getCapitulos(  Integer.parseInt(a.get(0).toString())).getNombre());
   }

 protected String updateNombreRequestCallBack(String value)
 {
  return value;
  }

 public void serviceDeleteCapitulos(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ELIMINAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   CapitulosManager.deleteCapitulos(  Integer.parseInt(a.get(0).toString()));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido eliminar el valor "+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 public void serviceAddUpdateCapitulos(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  try
  {
   CapitulosManager.addUpdateCapitulos(CapitulosHelper.createObj(request));
  }
   catch(Exception e)
  {
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }


}
