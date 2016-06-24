package net.idtoki.aveobras.model.map;

import java.util.Date;
import java.math.BigDecimal;

import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.map.MapBuilder;
import org.apache.torque.map.DatabaseMap;
import org.apache.torque.map.TableMap;

/**
  *  This class was autogenerated by Torque on:
  *
  * [Wed Oct 25 17:01:04 CEST 2006]
  *
  */
public class ClientesMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "net.idtoki.aveobras.model.map.ClientesMapBuilder";


    /**
     * The database map.
     */
    private DatabaseMap dbMap = null;

    /**
     * Tells us if this DatabaseMapBuilder is built so that we
     * don't have to re-build it every time.
     *
     * @return true if this DatabaseMapBuilder is built
     */
    public boolean isBuilt()
    {
        return (dbMap != null);
    }

    /**
     * Gets the databasemap this map builder built.
     *
     * @return the databasemap
     */
    public DatabaseMap getDatabaseMap()
    {
        return this.dbMap;
    }

    /**
     * The doBuild() method builds the DatabaseMap
     *
     * @throws TorqueException
     */
    public void doBuild() throws TorqueException
    {
        dbMap = Torque.getDatabaseMap("AVEOBRAS-DB");

        dbMap.addTable("clientes");
        TableMap tMap = dbMap.getTable("clientes");

        tMap.setPrimaryKeyMethod(TableMap.NATIVE);

        // this might need upgrading based on what all the databases
        // need, but for now assume one parameter.
          tMap.setPrimaryKeyMethodInfo("clientes_idcliente_seq");

              tMap.addPrimaryKey("clientes.IDCLIENTE", new Integer(0));
                    tMap.addColumn("clientes.CIF", "");
                    tMap.addColumn("clientes.FECHAALTA", "");
                    tMap.addColumn("clientes.FECHABAJA", "");
                    tMap.addColumn("clientes.NOMBRE", "");
                    tMap.addColumn("clientes.RAZONSOCIAL", "");
                    tMap.addColumn("clientes.REFERENCIA", "");
                    tMap.addColumn("clientes.CONTACTO", "");
                    tMap.addForeignKey(
                "clientes.IDLOCALIDAD", new Integer(0) , "localidades" ,
                "idlocalidad");
                    tMap.addColumn("clientes.DIRECCION", "");
                    tMap.addColumn("clientes.CP", "");
                    tMap.addColumn("clientes.TELEFONO", "");
                    tMap.addColumn("clientes.FAX", "");
                    tMap.addColumn("clientes.MOVIL", "");
                    tMap.addColumn("clientes.EMAIL", "");
                    tMap.addColumn("clientes.WWW", "");
                    tMap.addColumn("clientes.OBSERVACIONES", "");
          }
}