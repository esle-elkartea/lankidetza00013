package net.idtoki.aveobras.helper;

import net.zylk.web.WebUtils;
import net.zylk.web.helper.BaseHelper;
import javax.servlet.http.HttpServletRequest;
import org.apache.torque.TorqueException;
import net.zylk.tools.format.FormatUtils;


import net.idtoki.aveobras.model.CategoriasPeer;
import net.idtoki.aveobras.model.Categorias;
import net.idtoki.aveobras.manager.CategoriasManager;

/**
 * This class was autogenerated by Torque on:
 *
 * [Wed Oct 25 17:01:04 CEST 2006]
 *
 */
public abstract class BaseCategoriasHelper extends BaseHelper
{
	public static final String COMPLEX_ID_GET_METHOD = "getComplexId";
	private Categorias obj;
	public static final String IDCATEGORIA_GET_METHOD_NAME = "getIdcategoria";
	public static final String DESCRIPCION_GET_METHOD_NAME = "getDescripcion";


	public BaseCategoriasHelper()
	{
		this.obj = new Categorias();
	}

	public BaseCategoriasHelper(Categorias obj)
	{
		this.obj = obj;
	}


	public String getIdcategoriaHTMLAttrs()
	{
		return " name=\"" + getIdcategoriaName() + "\" " +
			   "id=\"" + getIdcategoriaId() + "\" " +
			   "value=\"" + getIdcategoriaValue() + "\" ";
	 }

	public String getIdcategoriaId()
	{
		return getIdcategoriaId(obj);
	}

	private static String getIdcategoriaId(Categorias o)
	{
		return CategoriasPeer.IDCATEGORIA;
	}

	public String getIdcategoriaName()
	{
		return getIdcategoriaName(obj);
	}

	private static String getIdcategoriaName(Categorias o)
	{
		return CategoriasPeer.IDCATEGORIA;
	}

	public String getIdcategoriaValue()
	{
		return getIdcategoriaValue(obj);
	}

	private static String getIdcategoriaValue(Categorias o)
	{
			return "" + o.getIdcategoria();
		}

	public String getDescripcionHTMLAttrs()
	{
		return " name=\"" + getDescripcionName() + "\" " +
			   "id=\"" + getDescripcionId() + "\" " +
			   "value=\"" + getDescripcionValue() + "\" ";
	 }

	public String getDescripcionId()
	{
		return getDescripcionId(obj);
	}

	private static String getDescripcionId(Categorias o)
	{
		return CategoriasPeer.DESCRIPCION;
	}

	public String getDescripcionName()
	{
		return getDescripcionName(obj);
	}

	private static String getDescripcionName(Categorias o)
	{
		return CategoriasPeer.DESCRIPCION;
	}

	public String getDescripcionValue()
	{
		return getDescripcionValue(obj);
	}

	private static String getDescripcionValue(Categorias o)
	{
			if(o.getDescripcion() != null)
			return "" + o.getDescripcion();
		else
			return "";
		}

	public static Categorias getCategorias(HttpServletRequest req) throws TorqueException
	{
										
		int id_Idcategoria = WebUtils.getintParam(req, getIdcategoriaName(new Categorias()));

	
		Categorias o = new Categorias();
		if((id_Idcategoria >= 0)) // no es nuevo y lo fijamos en el objeto
		{
			o = CategoriasManager.getCategorias(id_Idcategoria);
		}
		return o;
	}

	public static Categorias createObj(HttpServletRequest req) throws TorqueException
	{
		Categorias o =  BaseCategoriasHelper.getCategorias(req);
			 o.setIdcategoria(WebUtils.getintParam(req, getIdcategoriaName(o)));
		
			 o.setDescripcion(WebUtils.getStringParam(req, getDescripcionName(o)));
		
			return o;
	}
}
