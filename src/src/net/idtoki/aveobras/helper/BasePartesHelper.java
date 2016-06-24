package net.idtoki.aveobras.helper;

import net.zylk.web.WebUtils;
import net.zylk.web.helper.BaseHelper;
import javax.servlet.http.HttpServletRequest;
import org.apache.torque.TorqueException;
import net.zylk.tools.format.FormatUtils;


import net.idtoki.aveobras.model.PartesPeer;
import net.idtoki.aveobras.model.Partes;
import net.idtoki.aveobras.manager.PartesManager;

/**
 * This class was autogenerated by Torque on:
 *
 * [Wed Oct 25 17:01:04 CEST 2006]
 *
 */
public abstract class BasePartesHelper extends BaseHelper
{
	public static final String COMPLEX_ID_GET_METHOD = "getComplexId";
	private Partes obj;
	public static final String IDPARTE_GET_METHOD_NAME = "getIdparte";
	public static final String IDUEJECUCION_GET_METHOD_NAME = "getIduejecucion";
	public static final String IDOPERARIO_GET_METHOD_NAME = "getIdoperario";
	public static final String IDMAQUINARIA_GET_METHOD_NAME = "getIdmaquinaria";
	public static final String FECHA_GET_METHOD_NAME = "getFecha";
	public static final String REFERENCIA_GET_METHOD_NAME = "getReferencia";
	public static final String DESCRIPCION_GET_METHOD_NAME = "getDescripcion";
	public static final String OBSERVACIONES_GET_METHOD_NAME = "getObservaciones";
	public static final String HORAS_GET_METHOD_NAME = "getHoras";
	public static final String IMPORTE_GET_METHOD_NAME = "getImporte";


	public BasePartesHelper()
	{
		this.obj = new Partes();
	}

	public BasePartesHelper(Partes obj)
	{
		this.obj = obj;
	}


	public String getIdparteHTMLAttrs()
	{
		return " name=\"" + getIdparteName() + "\" " +
			   "id=\"" + getIdparteId() + "\" " +
			   "value=\"" + getIdparteValue() + "\" ";
	 }

	public String getIdparteId()
	{
		return getIdparteId(obj);
	}

	private static String getIdparteId(Partes o)
	{
		return PartesPeer.IDPARTE;
	}

	public String getIdparteName()
	{
		return getIdparteName(obj);
	}

	private static String getIdparteName(Partes o)
	{
		return PartesPeer.IDPARTE;
	}

	public String getIdparteValue()
	{
		return getIdparteValue(obj);
	}

	private static String getIdparteValue(Partes o)
	{
			return "" + o.getIdparte();
		}

	public String getIduejecucionHTMLAttrs()
	{
		return " name=\"" + getIduejecucionName() + "\" " +
			   "id=\"" + getIduejecucionId() + "\" " +
			   "value=\"" + getIduejecucionValue() + "\" ";
	 }

	public String getIduejecucionId()
	{
		return getIduejecucionId(obj);
	}

	private static String getIduejecucionId(Partes o)
	{
		return PartesPeer.IDUEJECUCION;
	}

	public String getIduejecucionName()
	{
		return getIduejecucionName(obj);
	}

	private static String getIduejecucionName(Partes o)
	{
		return PartesPeer.IDUEJECUCION;
	}

	public String getIduejecucionValue()
	{
		return getIduejecucionValue(obj);
	}

	private static String getIduejecucionValue(Partes o)
	{
			return "" + o.getIduejecucion();
		}

	public String getIdoperarioHTMLAttrs()
	{
		return " name=\"" + getIdoperarioName() + "\" " +
			   "id=\"" + getIdoperarioId() + "\" " +
			   "value=\"" + getIdoperarioValue() + "\" ";
	 }

	public String getIdoperarioId()
	{
		return getIdoperarioId(obj);
	}

	private static String getIdoperarioId(Partes o)
	{
		return PartesPeer.IDOPERARIO;
	}

	public String getIdoperarioName()
	{
		return getIdoperarioName(obj);
	}

	private static String getIdoperarioName(Partes o)
	{
		return PartesPeer.IDOPERARIO;
	}

	public String getIdoperarioValue()
	{
		return getIdoperarioValue(obj);
	}

	private static String getIdoperarioValue(Partes o)
	{
			return "" + o.getIdoperario();
		}

	public String getIdmaquinariaHTMLAttrs()
	{
		return " name=\"" + getIdmaquinariaName() + "\" " +
			   "id=\"" + getIdmaquinariaId() + "\" " +
			   "value=\"" + getIdmaquinariaValue() + "\" ";
	 }

	public String getIdmaquinariaId()
	{
		return getIdmaquinariaId(obj);
	}

	private static String getIdmaquinariaId(Partes o)
	{
		return PartesPeer.IDMAQUINARIA;
	}

	public String getIdmaquinariaName()
	{
		return getIdmaquinariaName(obj);
	}

	private static String getIdmaquinariaName(Partes o)
	{
		return PartesPeer.IDMAQUINARIA;
	}

	public String getIdmaquinariaValue()
	{
		return getIdmaquinariaValue(obj);
	}

	private static String getIdmaquinariaValue(Partes o)
	{
			return "" + o.getIdmaquinaria();
		}

	public String getFechaHTMLAttrs()
	{
		return " name=\"" + getFechaName() + "\" " +
			   "id=\"" + getFechaId() + "\" " +
			   "value=\"" + getFechaValue() + "\" ";
	 }

	public String getFechaId()
	{
		return getFechaId(obj);
	}

	private static String getFechaId(Partes o)
	{
		return PartesPeer.FECHA;
	}

	public String getFechaName()
	{
		return getFechaName(obj);
	}

	private static String getFechaName(Partes o)
	{
		return PartesPeer.FECHA;
	}

	public String getFechaValue()
	{
		return getFechaValue(obj);
	}

	private static String getFechaValue(Partes o)
	{
			if(o.getFecha() != null)
			return "" + o.getFecha();
		else
			return "";
		}

	public String getReferenciaHTMLAttrs()
	{
		return " name=\"" + getReferenciaName() + "\" " +
			   "id=\"" + getReferenciaId() + "\" " +
			   "value=\"" + getReferenciaValue() + "\" ";
	 }

	public String getReferenciaId()
	{
		return getReferenciaId(obj);
	}

	private static String getReferenciaId(Partes o)
	{
		return PartesPeer.REFERENCIA;
	}

	public String getReferenciaName()
	{
		return getReferenciaName(obj);
	}

	private static String getReferenciaName(Partes o)
	{
		return PartesPeer.REFERENCIA;
	}

	public String getReferenciaValue()
	{
		return getReferenciaValue(obj);
	}

	private static String getReferenciaValue(Partes o)
	{
			if(o.getReferencia() != null)
			return "" + o.getReferencia();
		else
			return "";
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

	private static String getDescripcionId(Partes o)
	{
		return PartesPeer.DESCRIPCION;
	}

	public String getDescripcionName()
	{
		return getDescripcionName(obj);
	}

	private static String getDescripcionName(Partes o)
	{
		return PartesPeer.DESCRIPCION;
	}

	public String getDescripcionValue()
	{
		return getDescripcionValue(obj);
	}

	private static String getDescripcionValue(Partes o)
	{
			if(o.getDescripcion() != null)
			return "" + o.getDescripcion();
		else
			return "";
		}

	public String getObservacionesHTMLAttrs()
	{
		return " name=\"" + getObservacionesName() + "\" " +
			   "id=\"" + getObservacionesId() + "\" " +
			   "value=\"" + getObservacionesValue() + "\" ";
	 }

	public String getObservacionesId()
	{
		return getObservacionesId(obj);
	}

	private static String getObservacionesId(Partes o)
	{
		return PartesPeer.OBSERVACIONES;
	}

	public String getObservacionesName()
	{
		return getObservacionesName(obj);
	}

	private static String getObservacionesName(Partes o)
	{
		return PartesPeer.OBSERVACIONES;
	}

	public String getObservacionesValue()
	{
		return getObservacionesValue(obj);
	}

	private static String getObservacionesValue(Partes o)
	{
			if(o.getObservaciones() != null)
			return "" + o.getObservaciones();
		else
			return "";
		}

	public String getHorasHTMLAttrs()
	{
		return " name=\"" + getHorasName() + "\" " +
			   "id=\"" + getHorasId() + "\" " +
			   "value=\"" + getHorasValue() + "\" ";
	 }

	public String getHorasId()
	{
		return getHorasId(obj);
	}

	private static String getHorasId(Partes o)
	{
		return PartesPeer.HORAS;
	}

	public String getHorasName()
	{
		return getHorasName(obj);
	}

	private static String getHorasName(Partes o)
	{
		return PartesPeer.HORAS;
	}

	public String getHorasValue()
	{
		return getHorasValue(obj);
	}

	private static String getHorasValue(Partes o)
	{
			return "" + o.getHoras();
		}

	public String getImporteHTMLAttrs()
	{
		return " name=\"" + getImporteName() + "\" " +
			   "id=\"" + getImporteId() + "\" " +
			   "value=\"" + getImporteValue() + "\" ";
	 }

	public String getImporteId()
	{
		return getImporteId(obj);
	}

	private static String getImporteId(Partes o)
	{
		return PartesPeer.IMPORTE;
	}

	public String getImporteName()
	{
		return getImporteName(obj);
	}

	private static String getImporteName(Partes o)
	{
		return PartesPeer.IMPORTE;
	}

	public String getImporteValue()
	{
		return getImporteValue(obj);
	}

	private static String getImporteValue(Partes o)
	{
			return "" + o.getImporte();
		}

	public static Partes getPartes(HttpServletRequest req) throws TorqueException
	{
										
		int id_Idparte = WebUtils.getintParam(req, getIdparteName(new Partes()));

	
		Partes o = new Partes();
		if((id_Idparte >= 0)) // no es nuevo y lo fijamos en el objeto
		{
			o = PartesManager.getPartes(id_Idparte);
		}
		return o;
	}

	public static Partes createObj(HttpServletRequest req) throws TorqueException
	{
		Partes o =  BasePartesHelper.getPartes(req);
			 o.setIdparte(WebUtils.getintParam(req, getIdparteName(o)));
		
			 		o.setIduejecucion(Integer.parseInt(FormatUtils.getFkIdFromString(WebUtils.getStringParam(req, getIduejecucionName(o)))));
		
			 		o.setIdoperario(Integer.parseInt(FormatUtils.getFkIdFromString(WebUtils.getStringParam(req, getIdoperarioName(o)))));
		
			 		o.setIdmaquinaria(Integer.parseInt(FormatUtils.getFkIdFromString(WebUtils.getStringParam(req, getIdmaquinariaName(o)))));
		
			 o.setFecha(WebUtils.getStringParam(req, getFechaName(o)));
		
			 o.setReferencia(WebUtils.getStringParam(req, getReferenciaName(o)));
		
			 o.setDescripcion(WebUtils.getStringParam(req, getDescripcionName(o)));
		
			 o.setObservaciones(WebUtils.getStringParam(req, getObservacionesName(o)));
		
			 o.setHoras(WebUtils.getdoubleParam(req, getHorasName(o)));
		
			 o.setImporte(WebUtils.getdoubleParam(req, getImporteName(o)));
		
			return o;
	}
}