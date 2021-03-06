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
public class ObrasMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "net.idtoki.aveobras.model.map.ObrasMapBuilder";


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

        dbMap.addTable("obras");
        TableMap tMap = dbMap.getTable("obras");

        tMap.setPrimaryKeyMethod(TableMap.NATIVE);

        // this might need upgrading based on what all the databases
        // need, but for now assume one parameter.
          tMap.setPrimaryKeyMethodInfo("obras_idobra_seq");

              tMap.addPrimaryKey("obras.IDOBRA", new Integer(0));
                    tMap.addForeignKey(
                "obras.IDCLIENTE", new Integer(0) , "clientes" ,
                "idcliente");
                    tMap.addColumn("obras.NUMEROCONTRATO", "");
                    tMap.addColumn("obras.REFERENCIA", "");
                    tMap.addColumn("obras.NOMBRE", "");
                    tMap.addForeignKey(
                "obras.IDLOCALIDAD", new Integer(0) , "localidades" ,
                "idlocalidad");
                    tMap.addColumn("obras.CALLE", "");
                    tMap.addColumn("obras.CP", "");
                    tMap.addColumn("obras.FECHAALTA", "");
                    tMap.addColumn("obras.FECHACOMIENZO", "");
                    tMap.addColumn("obras.FECHAFIN", "");
                    tMap.addColumn("obras.JORNADAS", new Integer(0));
                    tMap.addColumn("obras.OBSERVACIONES", "");
          }
}
