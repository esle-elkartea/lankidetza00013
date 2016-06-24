package net.idtoki.aveobras.manager;

import java.util.logging.Logger;
import net.idtoki.aveobras.model.SubcapitulosPeer;
import net.idtoki.aveobras.group.SubcapitulosGroupBean;
import net.idtoki.aveobras.model.Subcapitulos;
import net.zylk.torque.SearchQuery;
import net.zylk.torque.BaseQuery;
import net.zylk.torque.TorqueUtils;
import net.zylk.torque.manager.BaseManager;
import org.apache.torque.TorqueException;
import java.util.Enumeration;


import net.idtoki.aveobras.model.Capitulos;
import net.idtoki.aveobras.model.CapitulosPeer;

import org.apache.torque.util.Criteria;
import org.apache.torque.util.UniqueList;
import net.zylk.tools.ajax.AjaxUtils.DinamicGridBean;

/**
 * This class was autogenerated by Torque on:
 *
 * [Wed Oct 25 17:01:04 CEST 2006]
 *
 */
public abstract class BaseSubcapitulosManager extends BaseManager
{
	protected static final Logger logger = Logger.getLogger(
	   "net.idtoki.aveobras.managers.BaseSubcapitulosManager");

	public static final Criteria buildSearchCriteria(DinamicGridBean dgb)
	{
		return BaseManager.buildSearchCriteria(dgb, new SubcapitulosManager());
	}

	public static final Criteria buildSearchCriteria(String query, int offset, int limit)
	{
		return BaseManager.buildSearchCriteria(query, offset, limit, new SubcapitulosManager());
	}

	public static final Criteria buildSearchCriteria(String query)
	{
		return BaseManager.buildSearchCriteria(query, new SubcapitulosManager());
	}

	protected void addOrSearchCriteria(Criteria criteria,String campo,String valor, String condicion){
		Criteria.Criterion criterion = SubcapitulosManager.getSearchCriterion(campo,valor, condicion);
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
		Criteria.Criterion criterion = SubcapitulosManager.getSearchCriterion(campo,valor, condicion);
		criteria.and(criterion);
	}

	protected static Criteria.Criterion getSearchCriterion(String campo,String valor, String condicion){
        Criteria criteria =  new Criteria();
        Criteria.Criterion criterion = null;

			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(SubcapitulosPeer.IDSUBCAPITULO)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,SubcapitulosPeer.IDSUBCAPITULO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,SubcapitulosPeer.IDSUBCAPITULO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,SubcapitulosPeer.IDSUBCAPITULO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,SubcapitulosPeer.IDSUBCAPITULO,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(SubcapitulosPeer.IDCAPITULO)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,SubcapitulosPeer.IDCAPITULO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,SubcapitulosPeer.IDCAPITULO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,SubcapitulosPeer.IDCAPITULO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,SubcapitulosPeer.IDCAPITULO,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(SubcapitulosPeer.NOMBRE)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,SubcapitulosPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,SubcapitulosPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,SubcapitulosPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,SubcapitulosPeer.NOMBRE,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(SubcapitulosPeer.REFERENCIA)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,SubcapitulosPeer.REFERENCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,SubcapitulosPeer.REFERENCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,SubcapitulosPeer.REFERENCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,SubcapitulosPeer.REFERENCIA,valor,true);
		}
									if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(CapitulosPeer.IDCAPITULO)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,CapitulosPeer.IDCAPITULO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,CapitulosPeer.IDCAPITULO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,CapitulosPeer.IDCAPITULO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,CapitulosPeer.IDCAPITULO,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(CapitulosPeer.NOMBRE)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,CapitulosPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,CapitulosPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,CapitulosPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,CapitulosPeer.NOMBRE,valor,true);
		}
						
		return criterion;
	}

	public static final SubcapitulosGroupBean getSubcapituloss() {
    	return BaseSubcapitulosManager.getSubcapituloss(false);
	}

	public static final SubcapitulosGroupBean getSubcapituloss(boolean paginado) {
    	return BaseSubcapitulosManager.getSubcapituloss(new Criteria(), paginado,0);
	}

	public static final SubcapitulosGroupBean getSubcapituloss(Criteria c) {
		return BaseSubcapitulosManager.getSubcapituloss(c,false,0);
	}

	public static final SubcapitulosGroupBean getSubcapituloss(Criteria criteria,boolean paginado, int pagina) {
		SubcapitulosGroupBean objSubcapitulosGroupBean = new SubcapitulosGroupBean();
		objSubcapitulosGroupBean.setPaginaActual(pagina);
		objSubcapitulosGroupBean.setSubcapituloss(criteria, paginado);
		return objSubcapitulosGroupBean;
	}

							
	public static final Subcapitulos getSubcapitulos(int id_Idsubcapitulo) {
		Criteria c = new Criteria();
			c.add(SubcapitulosPeer.IDSUBCAPITULO, id_Idsubcapitulo);
			return BaseSubcapitulosManager.SubcapitulossGroupBean2Subcapitulos(BaseSubcapitulosManager.getSubcapituloss(c));
	}

	public static final Subcapitulos SubcapitulossGroupBean2Subcapitulos(SubcapitulosGroupBean obj){
		if(obj.size() == 1)
			return obj.getSubcapitulos(0);
		else
			return null;
	}

	private static void updateSubcapitulosAttribute(int id_Idsubcapitulo, String valor, String campo) throws Exception
	{
		Subcapitulos obj = BaseSubcapitulosManager.getSubcapitulos(id_Idsubcapitulo);
			if(campo.equals(SubcapitulosPeer.IDSUBCAPITULO))
					obj.setIdsubcapitulo(Integer.parseInt(valor)); //int
					if(campo.equals(SubcapitulosPeer.IDCAPITULO))
					obj.setIdcapitulo(Integer.parseInt(valor)); //int
					if(campo.equals(SubcapitulosPeer.NOMBRE))
					obj.setNombre(valor); //String
					if(campo.equals(SubcapitulosPeer.REFERENCIA))
					obj.setReferencia(valor); //String
					obj.save();
	}

	public static void updateIdsubcapitulo(int id_Idsubcapitulo, String valor) throws Exception
	{
		updateSubcapitulosAttribute(id_Idsubcapitulo, valor, SubcapitulosPeer.IDSUBCAPITULO);
	}
	public static void updateIdcapitulo(int id_Idsubcapitulo, String valor) throws Exception
	{
		updateSubcapitulosAttribute(id_Idsubcapitulo, valor, SubcapitulosPeer.IDCAPITULO);
	}
	public static void updateNombre(int id_Idsubcapitulo, String valor) throws Exception
	{
		updateSubcapitulosAttribute(id_Idsubcapitulo, valor, SubcapitulosPeer.NOMBRE);
	}
	public static void updateReferencia(int id_Idsubcapitulo, String valor) throws Exception
	{
		updateSubcapitulosAttribute(id_Idsubcapitulo, valor, SubcapitulosPeer.REFERENCIA);
	}

				public void addJoins(Criteria criteria)
	{
																																																	criteria.addJoin(SubcapitulosPeer.IDCAPITULO,CapitulosPeer.IDCAPITULO);
															}
	

  public static void deleteSubcapitulos(int id_Idsubcapitulo) throws TorqueException
  {
  	SubcapitulosPeer.doDelete(SubcapitulosManager.getSubcapitulos(id_Idsubcapitulo));
  }

  public static Subcapitulos addUpdateSubcapitulos(Subcapitulos obj) throws TorqueException
  {
	SubcapitulosGroupBean gb = new SubcapitulosGroupBean();
	gb.setElemento(obj);
	gb.save();
	return obj;
  }

}

