package net.idtoki.aveobras.manager;

import java.util.logging.Logger;
import net.idtoki.aveobras.model.ObrasPeer;
import net.idtoki.aveobras.group.ObrasGroupBean;
import net.idtoki.aveobras.model.Obras;
import net.zylk.torque.SearchQuery;
import net.zylk.torque.BaseQuery;
import net.zylk.torque.TorqueUtils;
import net.zylk.torque.manager.BaseManager;
import org.apache.torque.TorqueException;
import java.util.Enumeration;


import net.idtoki.aveobras.model.Clientes;
import net.idtoki.aveobras.model.ClientesPeer;
import net.idtoki.aveobras.model.Localidades;
import net.idtoki.aveobras.model.LocalidadesPeer;

import org.apache.torque.util.Criteria;
import org.apache.torque.util.UniqueList;
import net.zylk.tools.ajax.AjaxUtils.DinamicGridBean;

/**
 * This class was autogenerated by Torque on:
 *
 * [Wed Oct 25 17:01:04 CEST 2006]
 *
 */
public abstract class BaseObrasManager extends BaseManager
{
	protected static final Logger logger = Logger.getLogger(
	   "net.idtoki.aveobras.managers.BaseObrasManager");

	public static final Criteria buildSearchCriteria(DinamicGridBean dgb)
	{
		return BaseManager.buildSearchCriteria(dgb, new ObrasManager());
	}

	public static final Criteria buildSearchCriteria(String query, int offset, int limit)
	{
		return BaseManager.buildSearchCriteria(query, offset, limit, new ObrasManager());
	}

	public static final Criteria buildSearchCriteria(String query)
	{
		return BaseManager.buildSearchCriteria(query, new ObrasManager());
	}

	protected void addOrSearchCriteria(Criteria criteria,String campo,String valor, String condicion){
		Criteria.Criterion criterion = ObrasManager.getSearchCriterion(campo,valor, condicion);
		//Si existe ya un criterion hay que utilizarlo para añadir el or sino utilizará un and
		Enumeration enumeration =criteria.elements();
		if(enumeration.hasMoreElements()){
			Criteria.Criterion cr = (Criteria.Criterion) enumeration.nextElement();
			cr.or(criterion);
		}else{
			criteria.or(criterion);
		}
	}

	protected void addAndSearchCriteria(Criteria criteria,String campo, String valor, String condicion){
		Criteria.Criterion criterion = ObrasManager.getSearchCriterion(campo,valor, condicion);
		criteria.and(criterion);
	}

	protected static Criteria.Criterion getSearchCriterion(String campo,String valor, String condicion){
        Criteria criteria =  new Criteria();
        Criteria.Criterion criterion = null;

			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ObrasPeer.IDOBRA)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ObrasPeer.IDOBRA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ObrasPeer.IDOBRA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ObrasPeer.IDOBRA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ObrasPeer.IDOBRA,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ObrasPeer.IDCLIENTE)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ObrasPeer.IDCLIENTE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ObrasPeer.IDCLIENTE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ObrasPeer.IDCLIENTE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ObrasPeer.IDCLIENTE,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ObrasPeer.NUMEROCONTRATO)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ObrasPeer.NUMEROCONTRATO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ObrasPeer.NUMEROCONTRATO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ObrasPeer.NUMEROCONTRATO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ObrasPeer.NUMEROCONTRATO,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ObrasPeer.REFERENCIA)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ObrasPeer.REFERENCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ObrasPeer.REFERENCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ObrasPeer.REFERENCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ObrasPeer.REFERENCIA,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ObrasPeer.NOMBRE)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ObrasPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ObrasPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ObrasPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ObrasPeer.NOMBRE,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ObrasPeer.IDLOCALIDAD)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ObrasPeer.IDLOCALIDAD,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ObrasPeer.IDLOCALIDAD,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ObrasPeer.IDLOCALIDAD,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ObrasPeer.IDLOCALIDAD,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ObrasPeer.CALLE)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ObrasPeer.CALLE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ObrasPeer.CALLE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ObrasPeer.CALLE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ObrasPeer.CALLE,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ObrasPeer.CP)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ObrasPeer.CP,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ObrasPeer.CP,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ObrasPeer.CP,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ObrasPeer.CP,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ObrasPeer.FECHAALTA)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ObrasPeer.FECHAALTA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ObrasPeer.FECHAALTA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ObrasPeer.FECHAALTA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ObrasPeer.FECHAALTA,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ObrasPeer.FECHACOMIENZO)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ObrasPeer.FECHACOMIENZO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ObrasPeer.FECHACOMIENZO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ObrasPeer.FECHACOMIENZO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ObrasPeer.FECHACOMIENZO,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ObrasPeer.FECHAFIN)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ObrasPeer.FECHAFIN,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ObrasPeer.FECHAFIN,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ObrasPeer.FECHAFIN,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ObrasPeer.FECHAFIN,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ObrasPeer.JORNADAS)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ObrasPeer.JORNADAS,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ObrasPeer.JORNADAS,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ObrasPeer.JORNADAS,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ObrasPeer.JORNADAS,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ObrasPeer.OBSERVACIONES)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ObrasPeer.OBSERVACIONES,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ObrasPeer.OBSERVACIONES,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ObrasPeer.OBSERVACIONES,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ObrasPeer.OBSERVACIONES,valor,true);
		}
									if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ClientesPeer.IDCLIENTE)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ClientesPeer.IDCLIENTE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ClientesPeer.IDCLIENTE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ClientesPeer.IDCLIENTE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ClientesPeer.IDCLIENTE,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ClientesPeer.CIF)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ClientesPeer.CIF,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ClientesPeer.CIF,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ClientesPeer.CIF,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ClientesPeer.CIF,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ClientesPeer.FECHAALTA)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ClientesPeer.FECHAALTA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ClientesPeer.FECHAALTA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ClientesPeer.FECHAALTA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ClientesPeer.FECHAALTA,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ClientesPeer.FECHABAJA)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ClientesPeer.FECHABAJA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ClientesPeer.FECHABAJA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ClientesPeer.FECHABAJA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ClientesPeer.FECHABAJA,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ClientesPeer.NOMBRE)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ClientesPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ClientesPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ClientesPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ClientesPeer.NOMBRE,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ClientesPeer.RAZONSOCIAL)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ClientesPeer.RAZONSOCIAL,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ClientesPeer.RAZONSOCIAL,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ClientesPeer.RAZONSOCIAL,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ClientesPeer.RAZONSOCIAL,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ClientesPeer.REFERENCIA)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ClientesPeer.REFERENCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ClientesPeer.REFERENCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ClientesPeer.REFERENCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ClientesPeer.REFERENCIA,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ClientesPeer.CONTACTO)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ClientesPeer.CONTACTO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ClientesPeer.CONTACTO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ClientesPeer.CONTACTO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ClientesPeer.CONTACTO,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ClientesPeer.IDLOCALIDAD)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ClientesPeer.IDLOCALIDAD,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ClientesPeer.IDLOCALIDAD,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ClientesPeer.IDLOCALIDAD,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ClientesPeer.IDLOCALIDAD,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ClientesPeer.DIRECCION)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ClientesPeer.DIRECCION,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ClientesPeer.DIRECCION,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ClientesPeer.DIRECCION,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ClientesPeer.DIRECCION,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ClientesPeer.CP)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ClientesPeer.CP,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ClientesPeer.CP,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ClientesPeer.CP,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ClientesPeer.CP,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ClientesPeer.TELEFONO)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ClientesPeer.TELEFONO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ClientesPeer.TELEFONO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ClientesPeer.TELEFONO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ClientesPeer.TELEFONO,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ClientesPeer.FAX)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ClientesPeer.FAX,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ClientesPeer.FAX,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ClientesPeer.FAX,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ClientesPeer.FAX,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ClientesPeer.MOVIL)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ClientesPeer.MOVIL,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ClientesPeer.MOVIL,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ClientesPeer.MOVIL,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ClientesPeer.MOVIL,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ClientesPeer.EMAIL)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ClientesPeer.EMAIL,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ClientesPeer.EMAIL,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ClientesPeer.EMAIL,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ClientesPeer.EMAIL,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ClientesPeer.WWW)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ClientesPeer.WWW,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ClientesPeer.WWW,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ClientesPeer.WWW,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ClientesPeer.WWW,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ClientesPeer.OBSERVACIONES)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ClientesPeer.OBSERVACIONES,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ClientesPeer.OBSERVACIONES,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ClientesPeer.OBSERVACIONES,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ClientesPeer.OBSERVACIONES,valor,true);
		}
													if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(LocalidadesPeer.IDLOCALIDAD)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,LocalidadesPeer.IDLOCALIDAD,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,LocalidadesPeer.IDLOCALIDAD,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,LocalidadesPeer.IDLOCALIDAD,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,LocalidadesPeer.IDLOCALIDAD,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(LocalidadesPeer.IDPROVINCIA)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,LocalidadesPeer.IDPROVINCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,LocalidadesPeer.IDPROVINCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,LocalidadesPeer.IDPROVINCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,LocalidadesPeer.IDPROVINCIA,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(LocalidadesPeer.NOMBRE)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,LocalidadesPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,LocalidadesPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,LocalidadesPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,LocalidadesPeer.NOMBRE,valor,true);
		}
						
		return criterion;
	}

	public static final ObrasGroupBean getObrass() {
    	return BaseObrasManager.getObrass(false);
	}

	public static final ObrasGroupBean getObrass(boolean paginado) {
    	return BaseObrasManager.getObrass(new Criteria(), paginado,0);
	}

	public static final ObrasGroupBean getObrass(Criteria c) {
		return BaseObrasManager.getObrass(c,false,0);
	}

	public static final ObrasGroupBean getObrass(Criteria criteria,boolean paginado, int pagina) {
		ObrasGroupBean objObrasGroupBean = new ObrasGroupBean();
		objObrasGroupBean.setPaginaActual(pagina);
		objObrasGroupBean.setObrass(criteria, paginado);
		return objObrasGroupBean;
	}

							
	public static final Obras getObras(int id_Idobra) {
		Criteria c = new Criteria();
			c.add(ObrasPeer.IDOBRA, id_Idobra);
			return BaseObrasManager.ObrassGroupBean2Obras(BaseObrasManager.getObrass(c));
	}

	public static final Obras ObrassGroupBean2Obras(ObrasGroupBean obj){
		if(obj.size() == 1)
			return obj.getObras(0);
		else
			return null;
	}

	private static void updateObrasAttribute(int id_Idobra, String valor, String campo) throws Exception
	{
		Obras obj = BaseObrasManager.getObras(id_Idobra);
			if(campo.equals(ObrasPeer.IDOBRA))
					obj.setIdobra(Integer.parseInt(valor)); //int
					if(campo.equals(ObrasPeer.IDCLIENTE))
					obj.setIdcliente(Integer.parseInt(valor)); //int
					if(campo.equals(ObrasPeer.NUMEROCONTRATO))
					obj.setNumerocontrato(valor); //String
					if(campo.equals(ObrasPeer.REFERENCIA))
					obj.setReferencia(valor); //String
					if(campo.equals(ObrasPeer.NOMBRE))
					obj.setNombre(valor); //String
					if(campo.equals(ObrasPeer.IDLOCALIDAD))
					obj.setIdlocalidad(Integer.parseInt(valor)); //int
					if(campo.equals(ObrasPeer.CALLE))
					obj.setCalle(valor); //String
					if(campo.equals(ObrasPeer.CP))
					obj.setCp(valor); //String
					if(campo.equals(ObrasPeer.FECHAALTA))
					obj.setFechaalta(valor); //String
					if(campo.equals(ObrasPeer.FECHACOMIENZO))
					obj.setFechacomienzo(valor); //String
					if(campo.equals(ObrasPeer.FECHAFIN))
					obj.setFechafin(valor); //String
					if(campo.equals(ObrasPeer.JORNADAS))
					obj.setJornadas(Integer.parseInt(valor)); //int
					if(campo.equals(ObrasPeer.OBSERVACIONES))
					obj.setObservaciones(valor); //String
					obj.save();
	}

	public static void updateIdobra(int id_Idobra, String valor) throws Exception
	{
		updateObrasAttribute(id_Idobra, valor, ObrasPeer.IDOBRA);
	}
	public static void updateIdcliente(int id_Idobra, String valor) throws Exception
	{
		updateObrasAttribute(id_Idobra, valor, ObrasPeer.IDCLIENTE);
	}
	public static void updateNumerocontrato(int id_Idobra, String valor) throws Exception
	{
		updateObrasAttribute(id_Idobra, valor, ObrasPeer.NUMEROCONTRATO);
	}
	public static void updateReferencia(int id_Idobra, String valor) throws Exception
	{
		updateObrasAttribute(id_Idobra, valor, ObrasPeer.REFERENCIA);
	}
	public static void updateNombre(int id_Idobra, String valor) throws Exception
	{
		updateObrasAttribute(id_Idobra, valor, ObrasPeer.NOMBRE);
	}
	public static void updateIdlocalidad(int id_Idobra, String valor) throws Exception
	{
		updateObrasAttribute(id_Idobra, valor, ObrasPeer.IDLOCALIDAD);
	}
	public static void updateCalle(int id_Idobra, String valor) throws Exception
	{
		updateObrasAttribute(id_Idobra, valor, ObrasPeer.CALLE);
	}
	public static void updateCp(int id_Idobra, String valor) throws Exception
	{
		updateObrasAttribute(id_Idobra, valor, ObrasPeer.CP);
	}
	public static void updateFechaalta(int id_Idobra, String valor) throws Exception
	{
		updateObrasAttribute(id_Idobra, valor, ObrasPeer.FECHAALTA);
	}
	public static void updateFechacomienzo(int id_Idobra, String valor) throws Exception
	{
		updateObrasAttribute(id_Idobra, valor, ObrasPeer.FECHACOMIENZO);
	}
	public static void updateFechafin(int id_Idobra, String valor) throws Exception
	{
		updateObrasAttribute(id_Idobra, valor, ObrasPeer.FECHAFIN);
	}
	public static void updateJornadas(int id_Idobra, String valor) throws Exception
	{
		updateObrasAttribute(id_Idobra, valor, ObrasPeer.JORNADAS);
	}
	public static void updateObservaciones(int id_Idobra, String valor) throws Exception
	{
		updateObrasAttribute(id_Idobra, valor, ObrasPeer.OBSERVACIONES);
	}

					public void addJoins(Criteria criteria)
	{
																																																	criteria.addJoin(ObrasPeer.IDCLIENTE,ClientesPeer.IDCLIENTE);
																																																													criteria.addJoin(ObrasPeer.IDLOCALIDAD,LocalidadesPeer.IDLOCALIDAD);
															}
	

  public static void deleteObras(int id_Idobra) throws TorqueException
  {
  	ObrasPeer.doDelete(ObrasManager.getObras(id_Idobra));
  }

  public static Obras addUpdateObras(Obras obj) throws TorqueException
  {
	ObrasGroupBean gb = new ObrasGroupBean();
	gb.setElemento(obj);
	gb.save();
	return obj;
  }

}
