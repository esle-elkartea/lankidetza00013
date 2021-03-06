package net.idtoki.aveobras.helper;

import net.zylk.web.WebUtils;
import net.zylk.web.helper.BaseHelper;
import javax.servlet.http.HttpServletRequest;
import org.apache.torque.TorqueException;
import net.zylk.tools.format.FormatUtils;


import net.idtoki.aveobras.model.CapitulosPeer;
import net.idtoki.aveobras.model.Capitulos;
import net.idtoki.aveobras.manager.CapitulosManager;

/**
 * This class was autogenerated by Torque on:
 *
 * [Wed Oct 25 17:01:04 CEST 2006]
 *
 */
public abstract class BaseCapitulosHelper extends BaseHelper
{
	public static final String COMPLEX_ID_GET_METHOD = "getComplexId";
	private Capitulos obj;
	public static final String IDCAPITULO_GET_METHOD_NAME = "getIdcapitulo";
	public static final String NOMBRE_GET_METHOD_NAME = "getNombre";


	public BaseCapitulosHelper()
	{
		this.obj = new Capitulos();
	}

	public BaseCapitulosHelper(Capitulos obj)
	{
		this.obj = obj;
	}


	public String getIdcapituloHTMLAttrs()
	{
		return " name=\"" + getIdcapituloName() + "\" " +
			   "id=\"" + getIdcapituloId() + "\" " +
			   "value=\"" + getIdcapituloValue() + "\" ";
	 }

	public String getIdcapituloId()
	{
		return getIdcapituloId(obj);
	}

	private static String getIdcapituloId(Capitulos o)
	{
		return CapitulosPeer.IDCAPITULO;
	}

	public String getIdcapituloName()
	{
		return getIdcapituloName(obj);
	}

	private static String getIdcapituloName(Capitulos o)
	{
		return CapitulosPeer.IDCAPITULO;
	}

	public String getIdcapituloValue()
	{
		return getIdcapituloValue(obj);
	}

	private static String getIdcapituloValue(Capitulos o)
	{
			return "" + o.getIdcapitulo();
		}

	public String getNombreHTMLAttrs()
	{
		return " name=\"" + getNombreName() + "\" " +
			   "id=\"" + getNombreId() + "\" " +
			   "value=\"" + getNombreValue() + "\" ";
	 }

	public String getNombreId()
	{
		return getNombreId(obj);
	}

	private static String getNombreId(Capitulos o)
	{
		return CapitulosPeer.NOMBRE;
	}

	public String getNombreName()
	{
		return getNombreName(obj);
	}

	private static String getNombreName(Capitulos o)
	{
		return CapitulosPeer.NOMBRE;
	}

	public String getNombreValue()
	{
		return getNombreValue(obj);
	}

	private static String getNombreValue(Capitulos o)
	{
			if(o.getNombre() != null)
			return "" + o.getNombre();
		else
			return "";
		}

	public static Capitulos getCapitulos(HttpServletRequest req) throws TorqueException
	{
										
		int id_Idcapitulo = WebUtils.getintParam(req, getIdcapituloName(new Capitulos()));

	
		Capitulos o = new Capitulos();
		if((id_Idcapitulo >= 0)) // no es nuevo y lo fijamos en el objeto
		{
			o = CapitulosManager.getCapitulos(id_Idcapitulo);
		}
		return o;
	}

	public static Capitulos createObj(HttpServletRequest req) throws TorqueException
	{
		Capitulos o =  BaseCapitulosHelper.getCapitulos(req);
			 o.setIdcapitulo(WebUtils.getintParam(req, getIdcapituloName(o)));
		
			 o.setNombre(WebUtils.getStringParam(req, getNombreName(o)));
		
			return o;
	}
}
