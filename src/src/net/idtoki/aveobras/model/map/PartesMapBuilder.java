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
public class PartesMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "net.idtoki.aveobras.model.map.PartesMapBuilder";


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

        dbMap.addTable("partes");
        TableMap tMap = dbMap.getTable("partes");

        tMap.setPrimaryKeyMethod(TableMap.NATIVE);

        // this might need upgrading based on what all the databases
        // need, but for now assume one parameter.
          tMap.setPrimaryKeyMethodInfo("partes_idparte_seq");

              tMap.addPrimaryKey("partes.IDPARTE", new Integer(0));
                    tMap.addForeignKey(
                "partes.IDUEJECUCION", new Integer(0) , "uejecuciones" ,
                "iduejecucion");
                    tMap.addForeignKey(
                "partes.IDOPERARIO", new Integer(0) , "operarios" ,
                "idoperario");
                    tMap.addForeignKey(
                "partes.IDMAQUINARIA", new Integer(0) , "maquinarias" ,
                "idmaquinaria");
                    tMap.addColumn("partes.FECHA", "");
                    tMap.addColumn("partes.REFERENCIA", "");
                    tMap.addColumn("partes.DESCRIPCION", "");
                    tMap.addColumn("partes.OBSERVACIONES", "");
                    tMap.addColumn("partes.HORAS", new Double(0));
                    tMap.addColumn("partes.IMPORTE", new Double(0));
          }
}
