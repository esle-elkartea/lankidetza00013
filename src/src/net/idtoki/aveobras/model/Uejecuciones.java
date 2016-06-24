
package net.idtoki.aveobras.model;


import java.util.logging.Logger;

import net.zylk.tools.format.FormatUtils;

import org.apache.torque.TorqueException;
import org.apache.torque.om.Persistent;

/**
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Wed Apr 19 12:33:52 CEST 2006]
 *
 * You should add additional methods to this class to meet the
 * application requirements.  This class will only be generated as
 * long as it does not already exist in the output directory.
 */
public  class Uejecuciones
    extends net.idtoki.aveobras.model.BaseUejecuciones
    implements Persistent
{
	private static final Logger logger = Logger.getLogger("net.idtoki.aveobras.controller.Uejecuciones");
	
	public String getIdobraUejecucionesParsed()
	{
		String obra=null;
		try
		{
			obra=this.getObras().getIdobra() + "-" + this.getObras().getNombreObrasParsed()+ " (" + this.getObras().getIdclienteObrasParsed() + ")";
		}
		catch (TorqueException te) {
			logger.severe("No se ha podido localizar la obra. public String getIdobraUejecucionesParsed()" );
			te.printStackTrace();
		}
		return FormatUtils.genericParsedStr(obra);
	}
	public String getIdsubcapituloUejecucionesParsed()
	{
		String subcapitulo=null;
		try
		{
			subcapitulo=this.getSubcapitulos().getIdsubcapitulo() + "-" + this.getSubcapitulos().getNombreSubcapitulosParsed()+ " (" + this.getSubcapitulos().getIdcapituloSubcapitulosParsed() +")";
		}
		catch (TorqueException te) {
			logger.severe("No se ha podido localizar el subcapitulo. public String getIdsubcapituloUejecucionesParsed()" );
			te.printStackTrace();
		}
		return FormatUtils.genericParsedStr(subcapitulo);
	}
	public String getFechacomienzoUejecucionesParsed()
	{
		return FormatUtils.genericParsedStr(FormatUtils.aaaammdd2ddmmaaaa(this.getFechacomienzo(),"-"));
	}
	public String getFechafinUejecucionesParsed()
	{
		return FormatUtils.genericParsedStr(FormatUtils.aaaammdd2ddmmaaaa(this.getFechafin(),"-"));
	}	
	public String getHorasestimadasUejecucionesParsed()
	{
		return FormatUtils.genericParsedStr(this.getHorasestimadas()+"");
	}
	public String getImporteUejecucionesParsed()
	{
		return FormatUtils.genericParsedStr(this.getImporte()+"");
	}	
	public String getDescripcionUejecucionesParsed()
	{
		return FormatUtils.genericParsedStr(this.getDescripcion());
	}
	public String getObservacionesUejecucionesParsed()
	{
		return FormatUtils.genericParsedStr(this.getObservaciones());
	}	
	public String getReferenciaUejecucionesParsed()
	{
		return FormatUtils.genericParsedStr(this.getReferencia());
	}
	public String getDeleteUejecuciones()
	{
		return "<a href='#' class='eliminar' id='getDeleteUejecuciones" + this.getIduejecucion() + "'>&#160;&#160;&#160;&#160;</a>";
	}	
	public String getEditUejecuciones()
	{
		return "<a href='#' class='edicion' id='getEditUejecuciones" + this.getIduejecucion() + "'>&#160;&#160;&#160;&#160;</a>";
	}	
}
