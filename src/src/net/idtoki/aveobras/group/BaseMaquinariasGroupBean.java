package net.idtoki.aveobras.group;


import java.sql.Connection;
import java.util.List;
import java.util.logging.Logger;

//Torque classes
import org.apache.torque.TorqueException;
import org.apache.torque.util.Criteria;

import net.zylk.torque.group.BaseGroupBean;

// Local classes
import net.idtoki.aveobras.model.MaquinariasPeer;
import net.idtoki.aveobras.model.Maquinarias;

/**
 * This class was autogenerated by Torque on:
 *
 * [Wed Oct 25 17:01:04 CEST 2006]
 *
 */
public abstract class BaseMaquinariasGroupBean
    extends BaseGroupBean
{

    /** el logger para esta clase */
    private static final Logger logger = Logger
			.getLogger("net.idtoki.aveobras.BaseMaquinariasGroup");

    /**
     * @return the map builder for this peer
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */

	public void setMaquinariass(Criteria criteria, boolean paginado) {
		this.setElementos(criteria, paginado);
	}

	public Maquinarias getMaquinarias() {
		return (Maquinarias) getNext();
	}

	public Maquinarias getMaquinarias(int posicion) {
		return (Maquinarias) get(posicion);
	}


	//EHI : Implementacion de los metodos abstractos de la clase padre
	public List abstractSelect(Criteria c) throws TorqueException {
		return MaquinariasPeer.doSelect(c);
	}

	public List abstractVillageRecords(Criteria c) throws TorqueException {
		return MaquinariasPeer.doSelectVillageRecords(c);
	}

	public void abstractSave(Connection conn) throws TorqueException {
		Maquinarias element = null;
		while (this.next()) {
			element = this.getMaquinarias();
			element.save(conn);
		}
	}

	public void abstractDel(Connection conn) throws TorqueException {
		throw new TorqueException();
	}

	public String getDatabaseName(){
		return "AVEOBRAS-DB";
	}
}





