package net.idtoki.aveobras.manager;

import java.util.logging.Logger;
import net.idtoki.aveobras.model.ClientesPeer;
import net.idtoki.aveobras.group.ClientesGroupBean;
import net.idtoki.aveobras.model.Clientes;
import net.zylk.torque.SearchQuery;
import net.zylk.torque.BaseQuery;
import net.zylk.torque.TorqueUtils;
import net.zylk.torque.manager.BaseManager;
import org.apache.torque.TorqueException;
import java.util.Enumeration;


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
public abstract class BaseClientesManager extends BaseManager
{
	protected static final Logger logger = Logger.getLogger(
	   "net.idtoki.aveobras.managers.BaseClientesManager");

	public static final Criteria buildSearchCriteria(DinamicGridBean dgb)
	{
		return BaseManager.buildSearchCriteria(dgb, new ClientesManager());
	}

	public static final Criteria buildSearchCriteria(String query, int offset, int limit)
	{
		return BaseManager.buildSearchCriteria(query, offset, limit, new ClientesManager());
	}

	public static final Criteria buildSearchCriteria(String query)
	{
		return BaseManager.buildSearchCriteria(query, new ClientesManager());
	}

	protected void addOrSearchCriteria(Criteria criteria,String campo,String valor, String condicion){
		Criteria.Criterion criterion = ClientesManager.getSearchCriterion(campo,valor, condicion);
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
		Criteria.Criterion criterion = ClientesManager.getSearchCriterion(campo,valor, condicion);
		criteria.and(criterion);
	}

	protected static Criteria.Criterion getSearchCriterion(String campo,String valor, String condicion){
        Criteria criteria =  new Criteria();
        Criteria.Criterion criterion = null;

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

	public static final ClientesGroupBean getClientess() {
    	return BaseClientesManager.getClientess(false);
	}

	public static final ClientesGroupBean getClientess(boolean paginado) {
    	return BaseClientesManager.getClientess(new Criteria(), paginado,0);
	}

	public static final ClientesGroupBean getClientess(Criteria c) {
		return BaseClientesManager.getClientess(c,false,0);
	}

	public static final ClientesGroupBean getClientess(Criteria criteria,boolean paginado, int pagina) {
		ClientesGroupBean objClientesGroupBean = new ClientesGroupBean();
		objClientesGroupBean.setPaginaActual(pagina);
		objClientesGroupBean.setClientess(criteria, paginado);
		return objClientesGroupBean;
	}

							
	public static final Clientes getClientes(int id_Idcliente) {
		Criteria c = new Criteria();
			c.add(ClientesPeer.IDCLIENTE, id_Idcliente);
			return BaseClientesManager.ClientessGroupBean2Clientes(BaseClientesManager.getClientess(c));
	}

	public static final Clientes ClientessGroupBean2Clientes(ClientesGroupBean obj){
		if(obj.size() == 1)
			return obj.getClientes(0);
		else
			return null;
	}

	private static void updateClientesAttribute(int id_Idcliente, String valor, String campo) throws Exception
	{
		Clientes obj = BaseClientesManager.getClientes(id_Idcliente);
			if(campo.equals(ClientesPeer.IDCLIENTE))
					obj.setIdcliente(Integer.parseInt(valor)); //int
					if(campo.equals(ClientesPeer.CIF))
					obj.setCif(valor); //String
					if(campo.equals(ClientesPeer.FECHAALTA))
					obj.setFechaalta(valor); //String
					if(campo.equals(ClientesPeer.FECHABAJA))
					obj.setFechabaja(valor); //String
					if(campo.equals(ClientesPeer.NOMBRE))
					obj.setNombre(valor); //String
					if(campo.equals(ClientesPeer.RAZONSOCIAL))
					obj.setRazonsocial(valor); //String
					if(campo.equals(ClientesPeer.REFERENCIA))
					obj.setReferencia(valor); //String
					if(campo.equals(ClientesPeer.CONTACTO))
					obj.setContacto(valor); //String
					if(campo.equals(ClientesPeer.IDLOCALIDAD))
					obj.setIdlocalidad(Integer.parseInt(valor)); //int
					if(campo.equals(ClientesPeer.DIRECCION))
					obj.setDireccion(valor); //String
					if(campo.equals(ClientesPeer.CP))
					obj.setCp(valor); //String
					if(campo.equals(ClientesPeer.TELEFONO))
					obj.setTelefono(valor); //String
					if(campo.equals(ClientesPeer.FAX))
					obj.setFax(valor); //String
					if(campo.equals(ClientesPeer.MOVIL))
					obj.setMovil(valor); //String
					if(campo.equals(ClientesPeer.EMAIL))
					obj.setEmail(valor); //String
					if(campo.equals(ClientesPeer.WWW))
					obj.setWww(valor); //String
					if(campo.equals(ClientesPeer.OBSERVACIONES))
					obj.setObservaciones(valor); //String
					obj.save();
	}

	public static void updateIdcliente(int id_Idcliente, String valor) throws Exception
	{
		updateClientesAttribute(id_Idcliente, valor, ClientesPeer.IDCLIENTE);
	}
	public static void updateCif(int id_Idcliente, String valor) throws Exception
	{
		updateClientesAttribute(id_Idcliente, valor, ClientesPeer.CIF);
	}
	public static void updateFechaalta(int id_Idcliente, String valor) throws Exception
	{
		updateClientesAttribute(id_Idcliente, valor, ClientesPeer.FECHAALTA);
	}
	public static void updateFechabaja(int id_Idcliente, String valor) throws Exception
	{
		updateClientesAttribute(id_Idcliente, valor, ClientesPeer.FECHABAJA);
	}
	public static void updateNombre(int id_Idcliente, String valor) throws Exception
	{
		updateClientesAttribute(id_Idcliente, valor, ClientesPeer.NOMBRE);
	}
	public static void updateRazonsocial(int id_Idcliente, String valor) throws Exception
	{
		updateClientesAttribute(id_Idcliente, valor, ClientesPeer.RAZONSOCIAL);
	}
	public static void updateReferencia(int id_Idcliente, String valor) throws Exception
	{
		updateClientesAttribute(id_Idcliente, valor, ClientesPeer.REFERENCIA);
	}
	public static void updateContacto(int id_Idcliente, String valor) throws Exception
	{
		updateClientesAttribute(id_Idcliente, valor, ClientesPeer.CONTACTO);
	}
	public static void updateIdlocalidad(int id_Idcliente, String valor) throws Exception
	{
		updateClientesAttribute(id_Idcliente, valor, ClientesPeer.IDLOCALIDAD);
	}
	public static void updateDireccion(int id_Idcliente, String valor) throws Exception
	{
		updateClientesAttribute(id_Idcliente, valor, ClientesPeer.DIRECCION);
	}
	public static void updateCp(int id_Idcliente, String valor) throws Exception
	{
		updateClientesAttribute(id_Idcliente, valor, ClientesPeer.CP);
	}
	public static void updateTelefono(int id_Idcliente, String valor) throws Exception
	{
		updateClientesAttribute(id_Idcliente, valor, ClientesPeer.TELEFONO);
	}
	public static void updateFax(int id_Idcliente, String valor) throws Exception
	{
		updateClientesAttribute(id_Idcliente, valor, ClientesPeer.FAX);
	}
	public static void updateMovil(int id_Idcliente, String valor) throws Exception
	{
		updateClientesAttribute(id_Idcliente, valor, ClientesPeer.MOVIL);
	}
	public static void updateEmail(int id_Idcliente, String valor) throws Exception
	{
		updateClientesAttribute(id_Idcliente, valor, ClientesPeer.EMAIL);
	}
	public static void updateWww(int id_Idcliente, String valor) throws Exception
	{
		updateClientesAttribute(id_Idcliente, valor, ClientesPeer.WWW);
	}
	public static void updateObservaciones(int id_Idcliente, String valor) throws Exception
	{
		updateClientesAttribute(id_Idcliente, valor, ClientesPeer.OBSERVACIONES);
	}

				public void addJoins(Criteria criteria)
	{
																																																	criteria.addJoin(ClientesPeer.IDLOCALIDAD,LocalidadesPeer.IDLOCALIDAD);
															}
	

  public static void deleteClientes(int id_Idcliente) throws TorqueException
  {
  	ClientesPeer.doDelete(ClientesManager.getClientes(id_Idcliente));
  }

  public static Clientes addUpdateClientes(Clientes obj) throws TorqueException
  {
	ClientesGroupBean gb = new ClientesGroupBean();
	gb.setElemento(obj);
	gb.save();
	return obj;
  }

}

