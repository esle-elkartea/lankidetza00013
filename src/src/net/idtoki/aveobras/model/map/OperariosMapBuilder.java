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
public class OperariosMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "net.idtoki.aveobras.model.map.OperariosMapBuilder";


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

        dbMap.addTable("operarios");
        TableMap tMap = dbMap.getTable("operarios");

        tMap.setPrimaryKeyMethod(TableMap.NATIVE);

        // this might need upgrading based on what all the databases
        // need, but for now assume one parameter.
          tMap.setPrimaryKeyMethodInfo("operarios_idoperario_seq");

              tMap.addPrimaryKey("operarios.IDOPERARIO", new Integer(0));
                    tMap.addForeignKey(
                "operarios.IDCATEGORIA", new Integer(0) , "categorias" ,
                "idcategoria");
                    tMap.addColumn("operarios.REFERENCIA", "");
                    tMap.addColumn("operarios.NIF", "");
                    tMap.addColumn("operarios.NOMBRE", "");
                    tMap.addColumn("operarios.APELLIDOUNO", "");
                    tMap.addColumn("operarios.APELLIDODOS", "");
                    tMap.addColumn("operarios.FECHAALTA", "");
                    tMap.addColumn("operarios.FECHABAJA", "");
                    tMap.addColumn("operarios.NUMEROSS", "");
                    tMap.addColumn("operarios.DIRECCION", "");
                    tMap.addColumn("operarios.CP", "");
                    tMap.addForeignKey(
                "operarios.IDLOCALIDAD", new Integer(0) , "localidades" ,
                "idlocalidad");
                    tMap.addColumn("operarios.TELEFONO", "");
                    tMap.addColumn("operarios.MOVIL", "");
                    tMap.addColumn("operarios.EMAIL", "");
                    tMap.addColumn("operarios.COSTE", new Double(0));
                    tMap.addColumn("operarios.EXTERNO", new Integer(0));
                    tMap.addColumn("operarios.OBSERVACIONES", "");
          }
}
