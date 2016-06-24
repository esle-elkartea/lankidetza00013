package net.idtoki.aveobras.manager;

import java.util.logging.Logger;
import net.idtoki.aveobras.model.TipoincidenciasPeer;
import net.idtoki.aveobras.group.TipoincidenciasGroupBean;
import net.idtoki.aveobras.model.Tipoincidencias;
import net.zylk.torque.SearchQuery;
import net.zylk.torque.BaseQuery;
import net.zylk.torque.TorqueUtils;
import net.zylk.torque.manager.BaseManager;
import org.apache.torque.TorqueException;
import java.util.Enumeration;



import org.apache.torque.util.Criteria;
import org.apache.torque.util.UniqueList;
import net.zylk.tools.ajax.AjaxUtils.DinamicGridBean;

/**
 * This class was autogenerated by Torque on:
 *
 * [Wed Oct 25 17:01:04 CEST 2006]
 *
 */
public abstract class BaseTipoincidenciasManager extends BaseManager
{
	protected static final Logger logger = Logger.getLogger(
	   "net.idtoki.aveobras.managers.BaseTipoincidenciasManager");

	public static final Criteria buildSearchCriteria(DinamicGridBean dgb)
	{
		return BaseManager.buildSearchCriteria(dgb, new TipoincidenciasManager());
	}

	public static final Criteria buildSearchCriteria(String query, int offset, int limit)
	{
		return BaseManager.buildSearchCriteria(query, offset, limit, new TipoincidenciasManager());
	}

	public static final Criteria buildSearchCriteria(String query)
	{
		return BaseManager.buildSearchCriteria(query, new TipoincidenciasManager());
	}

	protected void addOrSearchCriteria(Criteria criteria,String campo,String valor, String condicion){
		Criteria.Criterion criterion = TipoincidenciasManager.getSearchCriterion(campo,valor, condicion);
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
		Criteria.Criterion criterion = TipoincidenciasManager.getSearchCriterion(campo,valor, condicion);
		criteria.and(criterion);
	}

	protected static Criteria.Criterion getSearchCriterion(String campo,String valor, String condicion){
        Criteria criteria =  new Criteria();
        Criteria.Criterion criterion = null;

			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(TipoincidenciasPeer.IDTIPOINCIDENCIA)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,TipoincidenciasPeer.IDTIPOINCIDENCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,TipoincidenciasPeer.IDTIPOINCIDENCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,TipoincidenciasPeer.IDTIPOINCIDENCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,TipoincidenciasPeer.IDTIPOINCIDENCIA,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(TipoincidenciasPeer.REFERENCIA)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,TipoincidenciasPeer.REFERENCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,TipoincidenciasPeer.REFERENCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,TipoincidenciasPeer.REFERENCIA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,TipoincidenciasPeer.REFERENCIA,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(TipoincidenciasPeer.DESCRIPCION)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,TipoincidenciasPeer.DESCRIPCION,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,TipoincidenciasPeer.DESCRIPCION,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,TipoincidenciasPeer.DESCRIPCION,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,TipoincidenciasPeer.DESCRIPCION,valor,true);
		}
		
		return criterion;
	}

	public static final TipoincidenciasGroupBean getTipoincidenciass() {
    	return BaseTipoincidenciasManager.getTipoincidenciass(false);
	}

	public static final TipoincidenciasGroupBean getTipoincidenciass(boolean paginado) {
    	return BaseTipoincidenciasManager.getTipoincidenciass(new Criteria(), paginado,0);
	}

	public static final TipoincidenciasGroupBean getTipoincidenciass(Criteria c) {
		return BaseTipoincidenciasManager.getTipoincidenciass(c,false,0);
	}

	public static final TipoincidenciasGroupBean getTipoincidenciass(Criteria criteria,boolean paginado, int pagina) {
		TipoincidenciasGroupBean objTipoincidenciasGroupBean = new TipoincidenciasGroupBean();
		objTipoincidenciasGroupBean.setPaginaActual(pagina);
		objTipoincidenciasGroupBean.setTipoincidenciass(criteria, paginado);
		return objTipoincidenciasGroupBean;
	}

							
	public static final Tipoincidencias getTipoincidencias(int id_Idtipoincidencia) {
		Criteria c = new Criteria();
			c.add(TipoincidenciasPeer.IDTIPOINCIDENCIA, id_Idtipoincidencia);
			return BaseTipoincidenciasManager.TipoincidenciassGroupBean2Tipoincidencias(BaseTipoincidenciasManager.getTipoincidenciass(c));
	}

	public static final Tipoincidencias TipoincidenciassGroupBean2Tipoincidencias(TipoincidenciasGroupBean obj){
		if(obj.size() == 1)
			return obj.getTipoincidencias(0);
		else
			return null;
	}

	private static void updateTipoincidenciasAttribute(int id_Idtipoincidencia, String valor, String campo) throws Exception
	{
		Tipoincidencias obj = BaseTipoincidenciasManager.getTipoincidencias(id_Idtipoincidencia);
			if(campo.equals(TipoincidenciasPeer.IDTIPOINCIDENCIA))
					obj.setIdtipoincidencia(Integer.parseInt(valor)); //int
					if(campo.equals(TipoincidenciasPeer.REFERENCIA))
					obj.setReferencia(valor); //String
					if(campo.equals(TipoincidenciasPeer.DESCRIPCION))
					obj.setDescripcion(valor); //String
					obj.save();
	}

	public static void updateIdtipoincidencia(int id_Idtipoincidencia, String valor) throws Exception
	{
		updateTipoincidenciasAttribute(id_Idtipoincidencia, valor, TipoincidenciasPeer.IDTIPOINCIDENCIA);
	}
	public static void updateReferencia(int id_Idtipoincidencia, String valor) throws Exception
	{
		updateTipoincidenciasAttribute(id_Idtipoincidencia, valor, TipoincidenciasPeer.REFERENCIA);
	}
	public static void updateDescripcion(int id_Idtipoincidencia, String valor) throws Exception
	{
		updateTipoincidenciasAttribute(id_Idtipoincidencia, valor, TipoincidenciasPeer.DESCRIPCION);
	}

			public void addJoins(Criteria criteria)
	{
	 //no tiene claves externas asi que el metodo no hace nada
	}
	

  public static void deleteTipoincidencias(int id_Idtipoincidencia) throws TorqueException
  {
  	TipoincidenciasPeer.doDelete(TipoincidenciasManager.getTipoincidencias(id_Idtipoincidencia));
  }

  public static Tipoincidencias addUpdateTipoincidencias(Tipoincidencias obj) throws TorqueException
  {
	TipoincidenciasGroupBean gb = new TipoincidenciasGroupBean();
	gb.setElemento(obj);
	gb.save();
	return obj;
  }

}
