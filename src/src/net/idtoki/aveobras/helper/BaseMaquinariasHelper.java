package net.idtoki.aveobras.helper;

import net.zylk.web.WebUtils;
import net.zylk.web.helper.BaseHelper;
import javax.servlet.http.HttpServletRequest;
import org.apache.torque.TorqueException;
import net.zylk.tools.format.FormatUtils;


import net.idtoki.aveobras.model.MaquinariasPeer;
import net.idtoki.aveobras.model.Maquinarias;
import net.idtoki.aveobras.manager.MaquinariasManager;

/**
 * This class was autogenerated by Torque on:
 *
 * [Wed Oct 25 17:01:04 CEST 2006]
 *
 */
public abstract class BaseMaquinariasHelper extends BaseHelper
{
	public static final String COMPLEX_ID_GET_METHOD = "getComplexId";
	private Maquinarias obj;
	public static final String IDMAQUINARIA_GET_METHOD_NAME = "getIdmaquinaria";
	public static final String NOMBRE_GET_METHOD_NAME = "getNombre";
	public static final String REFERENCIA_GET_METHOD_NAME = "getReferencia";
	public static final String BASTIDOR_GET_METHOD_NAME = "getBastidor";
	public static final String MATRICULA_GET_METHOD_NAME = "getMatricula";
	public static final String FECHAALTA_GET_METHOD_NAME = "getFechaalta";
	public static final String FECHABAJA_GET_METHOD_NAME = "getFechabaja";
	public static final String RESPONSABLE_GET_METHOD_NAME = "getResponsable";
	public static final String COSTE_GET_METHOD_NAME = "getCoste";
	public static final String MODELO_GET_METHOD_NAME = "getModelo";
	public static final String MARCA_GET_METHOD_NAME = "getMarca";
	public static final String TIPO_GET_METHOD_NAME = "getTipo";
	public static final String ALQUILADO_GET_METHOD_NAME = "getAlquilado";
	public static final String OBSERVACIONES_GET_METHOD_NAME = "getObservaciones";


	public BaseMaquinariasHelper()
	{
		this.obj = new Maquinarias();
	}

	public BaseMaquinariasHelper(Maquinarias obj)
	{
		this.obj = obj;
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

	private static String getIdmaquinariaId(Maquinarias o)
	{
		return MaquinariasPeer.IDMAQUINARIA;
	}

	public String getIdmaquinariaName()
	{
		return getIdmaquinariaName(obj);
	}

	private static String getIdmaquinariaName(Maquinarias o)
	{
		return MaquinariasPeer.IDMAQUINARIA;
	}

	public String getIdmaquinariaValue()
	{
		return getIdmaquinariaValue(obj);
	}

	private static String getIdmaquinariaValue(Maquinarias o)
	{
			return "" + o.getIdmaquinaria();
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

	private static String getNombreId(Maquinarias o)
	{
		return MaquinariasPeer.NOMBRE;
	}

	public String getNombreName()
	{
		return getNombreName(obj);
	}

	private static String getNombreName(Maquinarias o)
	{
		return MaquinariasPeer.NOMBRE;
	}

	public String getNombreValue()
	{
		return getNombreValue(obj);
	}

	private static String getNombreValue(Maquinarias o)
	{
			if(o.getNombre() != null)
			return "" + o.getNombre();
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

	private static String getReferenciaId(Maquinarias o)
	{
		return MaquinariasPeer.REFERENCIA;
	}

	public String getReferenciaName()
	{
		return getReferenciaName(obj);
	}

	private static String getReferenciaName(Maquinarias o)
	{
		return MaquinariasPeer.REFERENCIA;
	}

	public String getReferenciaValue()
	{
		return getReferenciaValue(obj);
	}

	private static String getReferenciaValue(Maquinarias o)
	{
			if(o.getReferencia() != null)
			return "" + o.getReferencia();
		else
			return "";
		}

	public String getBastidorHTMLAttrs()
	{
		return " name=\"" + getBastidorName() + "\" " +
			   "id=\"" + getBastidorId() + "\" " +
			   "value=\"" + getBastidorValue() + "\" ";
	 }

	public String getBastidorId()
	{
		return getBastidorId(obj);
	}

	private static String getBastidorId(Maquinarias o)
	{
		return MaquinariasPeer.BASTIDOR;
	}

	public String getBastidorName()
	{
		return getBastidorName(obj);
	}

	private static String getBastidorName(Maquinarias o)
	{
		return MaquinariasPeer.BASTIDOR;
	}

	public String getBastidorValue()
	{
		return getBastidorValue(obj);
	}

	private static String getBastidorValue(Maquinarias o)
	{
			if(o.getBastidor() != null)
			return "" + o.getBastidor();
		else
			return "";
		}

	public String getMatriculaHTMLAttrs()
	{
		return " name=\"" + getMatriculaName() + "\" " +
			   "id=\"" + getMatriculaId() + "\" " +
			   "value=\"" + getMatriculaValue() + "\" ";
	 }

	public String getMatriculaId()
	{
		return getMatriculaId(obj);
	}

	private static String getMatriculaId(Maquinarias o)
	{
		return MaquinariasPeer.MATRICULA;
	}

	public String getMatriculaName()
	{
		return getMatriculaName(obj);
	}

	private static String getMatriculaName(Maquinarias o)
	{
		return MaquinariasPeer.MATRICULA;
	}

	public String getMatriculaValue()
	{
		return getMatriculaValue(obj);
	}

	private static String getMatriculaValue(Maquinarias o)
	{
			if(o.getMatricula() != null)
			return "" + o.getMatricula();
		else
			return "";
		}

	public String getFechaaltaHTMLAttrs()
	{
		return " name=\"" + getFechaaltaName() + "\" " +
			   "id=\"" + getFechaaltaId() + "\" " +
			   "value=\"" + getFechaaltaValue() + "\" ";
	 }

	public String getFechaaltaId()
	{
		return getFechaaltaId(obj);
	}

	private static String getFechaaltaId(Maquinarias o)
	{
		return MaquinariasPeer.FECHAALTA;
	}

	public String getFechaaltaName()
	{
		return getFechaaltaName(obj);
	}

	private static String getFechaaltaName(Maquinarias o)
	{
		return MaquinariasPeer.FECHAALTA;
	}

	public String getFechaaltaValue()
	{
		return getFechaaltaValue(obj);
	}

	private static String getFechaaltaValue(Maquinarias o)
	{
			if(o.getFechaalta() != null)
			return "" + o.getFechaalta();
		else
			return "";
		}

	public String getFechabajaHTMLAttrs()
	{
		return " name=\"" + getFechabajaName() + "\" " +
			   "id=\"" + getFechabajaId() + "\" " +
			   "value=\"" + getFechabajaValue() + "\" ";
	 }

	public String getFechabajaId()
	{
		return getFechabajaId(obj);
	}

	private static String getFechabajaId(Maquinarias o)
	{
		return MaquinariasPeer.FECHABAJA;
	}

	public String getFechabajaName()
	{
		return getFechabajaName(obj);
	}

	private static String getFechabajaName(Maquinarias o)
	{
		return MaquinariasPeer.FECHABAJA;
	}

	public String getFechabajaValue()
	{
		return getFechabajaValue(obj);
	}

	private static String getFechabajaValue(Maquinarias o)
	{
			if(o.getFechabaja() != null)
			return "" + o.getFechabaja();
		else
			return "";
		}

	public String getResponsableHTMLAttrs()
	{
		return " name=\"" + getResponsableName() + "\" " +
			   "id=\"" + getResponsableId() + "\" " +
			   "value=\"" + getResponsableValue() + "\" ";
	 }

	public String getResponsableId()
	{
		return getResponsableId(obj);
	}

	private static String getResponsableId(Maquinarias o)
	{
		return MaquinariasPeer.RESPONSABLE;
	}

	public String getResponsableName()
	{
		return getResponsableName(obj);
	}

	private static String getResponsableName(Maquinarias o)
	{
		return MaquinariasPeer.RESPONSABLE;
	}

	public String getResponsableValue()
	{
		return getResponsableValue(obj);
	}

	private static String getResponsableValue(Maquinarias o)
	{
			if(o.getResponsable() != null)
			return "" + o.getResponsable();
		else
			return "";
		}

	public String getCosteHTMLAttrs()
	{
		return " name=\"" + getCosteName() + "\" " +
			   "id=\"" + getCosteId() + "\" " +
			   "value=\"" + getCosteValue() + "\" ";
	 }

	public String getCosteId()
	{
		return getCosteId(obj);
	}

	private static String getCosteId(Maquinarias o)
	{
		return MaquinariasPeer.COSTE;
	}

	public String getCosteName()
	{
		return getCosteName(obj);
	}

	private static String getCosteName(Maquinarias o)
	{
		return MaquinariasPeer.COSTE;
	}

	public String getCosteValue()
	{
		return getCosteValue(obj);
	}

	private static String getCosteValue(Maquinarias o)
	{
			return "" + o.getCoste();
		}

	public String getModeloHTMLAttrs()
	{
		return " name=\"" + getModeloName() + "\" " +
			   "id=\"" + getModeloId() + "\" " +
			   "value=\"" + getModeloValue() + "\" ";
	 }

	public String getModeloId()
	{
		return getModeloId(obj);
	}

	private static String getModeloId(Maquinarias o)
	{
		return MaquinariasPeer.MODELO;
	}

	public String getModeloName()
	{
		return getModeloName(obj);
	}

	private static String getModeloName(Maquinarias o)
	{
		return MaquinariasPeer.MODELO;
	}

	public String getModeloValue()
	{
		return getModeloValue(obj);
	}

	private static String getModeloValue(Maquinarias o)
	{
			if(o.getModelo() != null)
			return "" + o.getModelo();
		else
			return "";
		}

	public String getMarcaHTMLAttrs()
	{
		return " name=\"" + getMarcaName() + "\" " +
			   "id=\"" + getMarcaId() + "\" " +
			   "value=\"" + getMarcaValue() + "\" ";
	 }

	public String getMarcaId()
	{
		return getMarcaId(obj);
	}

	private static String getMarcaId(Maquinarias o)
	{
		return MaquinariasPeer.MARCA;
	}

	public String getMarcaName()
	{
		return getMarcaName(obj);
	}

	private static String getMarcaName(Maquinarias o)
	{
		return MaquinariasPeer.MARCA;
	}

	public String getMarcaValue()
	{
		return getMarcaValue(obj);
	}

	private static String getMarcaValue(Maquinarias o)
	{
			if(o.getMarca() != null)
			return "" + o.getMarca();
		else
			return "";
		}

	public String getTipoHTMLAttrs()
	{
		return " name=\"" + getTipoName() + "\" " +
			   "id=\"" + getTipoId() + "\" " +
			   "value=\"" + getTipoValue() + "\" ";
	 }

	public String getTipoId()
	{
		return getTipoId(obj);
	}

	private static String getTipoId(Maquinarias o)
	{
		return MaquinariasPeer.TIPO;
	}

	public String getTipoName()
	{
		return getTipoName(obj);
	}

	private static String getTipoName(Maquinarias o)
	{
		return MaquinariasPeer.TIPO;
	}

	public String getTipoValue()
	{
		return getTipoValue(obj);
	}

	private static String getTipoValue(Maquinarias o)
	{
			if(o.getTipo() != null)
			return "" + o.getTipo();
		else
			return "";
		}

	public String getAlquiladoHTMLAttrs()
	{
		return " name=\"" + getAlquiladoName() + "\" " +
			   "id=\"" + getAlquiladoId() + "\" " +
			   "value=\"" + getAlquiladoValue() + "\" ";
	 }

	public String getAlquiladoId()
	{
		return getAlquiladoId(obj);
	}

	private static String getAlquiladoId(Maquinarias o)
	{
		return MaquinariasPeer.ALQUILADO;
	}

	public String getAlquiladoName()
	{
		return getAlquiladoName(obj);
	}

	private static String getAlquiladoName(Maquinarias o)
	{
		return MaquinariasPeer.ALQUILADO;
	}

	public String getAlquiladoValue()
	{
		return getAlquiladoValue(obj);
	}

	private static String getAlquiladoValue(Maquinarias o)
	{
			return "" + o.getAlquilado();
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

	private static String getObservacionesId(Maquinarias o)
	{
		return MaquinariasPeer.OBSERVACIONES;
	}

	public String getObservacionesName()
	{
		return getObservacionesName(obj);
	}

	private static String getObservacionesName(Maquinarias o)
	{
		return MaquinariasPeer.OBSERVACIONES;
	}

	public String getObservacionesValue()
	{
		return getObservacionesValue(obj);
	}

	private static String getObservacionesValue(Maquinarias o)
	{
			if(o.getObservaciones() != null)
			return "" + o.getObservaciones();
		else
			return "";
		}

	public static Maquinarias getMaquinarias(HttpServletRequest req) throws TorqueException
	{
										
		int id_Idmaquinaria = WebUtils.getintParam(req, getIdmaquinariaName(new Maquinarias()));

	
		Maquinarias o = new Maquinarias();
		if((id_Idmaquinaria >= 0)) // no es nuevo y lo fijamos en el objeto
		{
			o = MaquinariasManager.getMaquinarias(id_Idmaquinaria);
		}
		return o;
	}

	public static Maquinarias createObj(HttpServletRequest req) throws TorqueException
	{
		Maquinarias o =  BaseMaquinariasHelper.getMaquinarias(req);
			 o.setIdmaquinaria(WebUtils.getintParam(req, getIdmaquinariaName(o)));
		
			 o.setNombre(WebUtils.getStringParam(req, getNombreName(o)));
		
			 o.setReferencia(WebUtils.getStringParam(req, getReferenciaName(o)));
		
			 o.setBastidor(WebUtils.getStringParam(req, getBastidorName(o)));
		
			 o.setMatricula(WebUtils.getStringParam(req, getMatriculaName(o)));
		
			 o.setFechaalta(WebUtils.getStringParam(req, getFechaaltaName(o)));
		
			 o.setFechabaja(WebUtils.getStringParam(req, getFechabajaName(o)));
		
			 o.setResponsable(WebUtils.getStringParam(req, getResponsableName(o)));
		
			 o.setCoste(WebUtils.getdoubleParam(req, getCosteName(o)));
		
			 o.setModelo(WebUtils.getStringParam(req, getModeloName(o)));
		
			 o.setMarca(WebUtils.getStringParam(req, getMarcaName(o)));
		
			 o.setTipo(WebUtils.getStringParam(req, getTipoName(o)));
		
			 o.setAlquilado(WebUtils.getintParam(req, getAlquiladoName(o)));
		
			 o.setObservaciones(WebUtils.getStringParam(req, getObservacionesName(o)));
		
			return o;
	}
}