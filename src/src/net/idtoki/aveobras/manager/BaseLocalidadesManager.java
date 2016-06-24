package net.idtoki.aveobras.manager;

import java.util.logging.Logger;
import net.idtoki.aveobras.model.LocalidadesPeer;
import net.idtoki.aveobras.group.LocalidadesGroupBean;
import net.idtoki.aveobras.model.Localidades;
import net.zylk.torque.SearchQuery;
import net.zylk.torque.BaseQuery;
import net.zylk.torque.TorqueUtils;
import net.zylk.torque.manager.BaseManager;
import org.apache.torque.TorqueException;
import java.util.Enumeration;


import net.idtoki.aveobras.model.Provincias;
import net.idtoki.aveobras.model.ProvinciasPeer;

import org.apache.torque.util.Criteria;
import org.apache.torque.util.UniqueList;
import net.zylk.tools.ajax.AjaxUtils.DinamicGridBean;

/**
 * This class was autogenerated by Torque on:
 *
 * [Wed Oct 25 17:01:04 CEST 2006]
 *
 */
public abstract class BaseLocalidadesManager extends BaseManager
{
	protected static final Logger logger = Logger.getLogger(
	   "net.idtoki.aveobras.managers.BaseLocalidadesManager");

	public static final Criteria buildSearchCriteria(DinamicGridBean dgb)
	{
		return BaseManager.buildSearchCriteria(dgb, new LocalidadesManager());
	}

	public static final Criteria buildSearchCriteria(String query, int offset, int limit)
	{
		return BaseManager.buildSearchCriteria(query, offset, limit, new LocalidadesManager());
	}

	public static final Criteria buildSearchCriteria(String query)
	{
		return BaseManager.buildSearchCriteria(query, new LocalidadesManager());
	}

	protected void addOrSearchCriteria(Criteria criteria,String campo,String valor, String condicion){
		Criteria.Criterion criterion = LocalidadesManager.getSearchCriterion(campo,valor, condicion);
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
		Criteria.Criterion criterion = LocalidadesManager.getSearchCriterion(campo,valor, condicion);
		criteria.and(criterion);
	}

	protected static Criteria.Criterion getSearchCriterion(String campo,String valor, String condicion){
        Criteria criteria =  new Criteria();
        Criteria.Criterion criterion = null;

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
									if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ProvinciasPeer.IDPROVINCIA)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ProvinciasPeer.IDPROVINCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ProvinciasPeer.IDPROVINCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ProvinciasPeer.IDPROVINCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ProvinciasPeer.IDPROVINCIA,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ProvinciasPeer.NOMBRE)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ProvinciasPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ProvinciasPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ProvinciasPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ProvinciasPeer.NOMBRE,valor,true);
		}
						
		return criterion;
	}

	public static final LocalidadesGroupBean getLocalidadess() {
    	return BaseLocalidadesManager.getLocalidadess(false);
	}

	public static final LocalidadesGroupBean getLocalidadess(boolean paginado) {
    	return BaseLocalidadesManager.getLocalidadess(new Criteria(), paginado,0);
	}

	public static final LocalidadesGroupBean getLocalidadess(Criteria c) {
		return BaseLocalidadesManager.getLocalidadess(c,false,0);
	}

	public static final LocalidadesGroupBean getLocalidadess(Criteria criteria,boolean paginado, int pagina) {
		LocalidadesGroupBean objLocalidadesGroupBean = new LocalidadesGroupBean();
		objLocalidadesGroupBean.setPaginaActual(pagina);
		objLocalidadesGroupBean.setLocalidadess(criteria, paginado);
		return objLocalidadesGroupBean;
	}

							
	public static final Localidades getLocalidades(int id_Idlocalidad) {
		Criteria c = new Criteria();
			c.add(LocalidadesPeer.IDLOCALIDAD, id_Idlocalidad);
			return BaseLocalidadesManager.LocalidadessGroupBean2Localidades(BaseLocalidadesManager.getLocalidadess(c));
	}

	public static final Localidades LocalidadessGroupBean2Localidades(LocalidadesGroupBean obj){
		if(obj.size() == 1)
			return obj.getLocalidades(0);
		else
			return null;
	}

	private static void updateLocalidadesAttribute(int id_Idlocalidad, String valor, String campo) throws Exception
	{
		Localidades obj = BaseLocalidadesManager.getLocalidades(id_Idlocalidad);
			if(campo.equals(LocalidadesPeer.IDLOCALIDAD))
					obj.setIdlocalidad(Integer.parseInt(valor)); //int
					if(campo.equals(LocalidadesPeer.IDPROVINCIA))
					obj.setIdprovincia(Integer.parseInt(valor)); //int
					if(campo.equals(LocalidadesPeer.NOMBRE))
					obj.setNombre(valor); //String
					obj.save();
	}

	public static void updateIdlocalidad(int id_Idlocalidad, String valor) throws Exception
	{
		updateLocalidadesAttribute(id_Idlocalidad, valor, LocalidadesPeer.IDLOCALIDAD);
	}
	public static void updateIdprovincia(int id_Idlocalidad, String valor) throws Exception
	{
		updateLocalidadesAttribute(id_Idlocalidad, valor, LocalidadesPeer.IDPROVINCIA);
	}
	public static void updateNombre(int id_Idlocalidad, String valor) throws Exception
	{
		updateLocalidadesAttribute(id_Idlocalidad, valor, LocalidadesPeer.NOMBRE);
	}

				public void addJoins(Criteria criteria)
	{
																																																	criteria.addJoin(LocalidadesPeer.IDPROVINCIA,ProvinciasPeer.IDPROVINCIA);
															}
	

  public static void deleteLocalidades(int id_Idlocalidad) throws TorqueException
  {
  	LocalidadesPeer.doDelete(LocalidadesManager.getLocalidades(id_Idlocalidad));
  }

  public static Localidades addUpdateLocalidades(Localidades obj) throws TorqueException
  {
	LocalidadesGroupBean gb = new LocalidadesGroupBean();
	gb.setElemento(obj);
	gb.save();
	return obj;
  }

}
