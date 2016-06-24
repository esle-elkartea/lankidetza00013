package net.idtoki.aveobras.model;


import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import net.zylk.tools.ajax.AjaxUtils;

import org.apache.commons.lang.ObjectUtils;
import org.apache.torque.TorqueException;
import org.apache.torque.om.BaseObject;
import org.apache.torque.om.ComboKey;
import org.apache.torque.om.DateKey;
import org.apache.torque.om.NumberKey;
import org.apache.torque.om.ObjectKey;
import org.apache.torque.om.SimpleKey;
import org.apache.torque.om.StringKey;
import org.apache.torque.om.Persistent;
import org.apache.torque.util.Criteria;
import org.apache.torque.util.Transaction;

  
    
  
/**
 * This class was autogenerated by Torque on:
 *
 * [Wed Oct 25 17:01:04 CEST 2006]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to Obras
 */
public abstract class BaseObras extends BaseObject
{
    /** The Peer class */
    private static final ObrasPeer peer =
        new ObrasPeer();

                                            
    /** The value for the idobra field */
    private int idobra = -1;
                                          
    /** The value for the idcliente field */
    private int idcliente = 0;
                                                
    /** The value for the numerocontrato field */
    private String numerocontrato = "";
                                                
    /** The value for the referencia field */
    private String referencia = "";
                                                
    /** The value for the nombre field */
    private String nombre = "";
                                          
    /** The value for the idlocalidad field */
    private int idlocalidad = 0;
                                                
    /** The value for the calle field */
    private String calle = "";
                                                
    /** The value for the cp field */
    private String cp = "";
                                                
    /** The value for the fechaalta field */
    private String fechaalta = "";
                                                
    /** The value for the fechacomienzo field */
    private String fechacomienzo = "";
                                                
    /** The value for the fechafin field */
    private String fechafin = "";
                                          
    /** The value for the jornadas field */
    private int jornadas = 0;
                                                
    /** The value for the observaciones field */
    private String observaciones = "";
  
    
    /**
     * Get the Idobra
     *
     * @return int
     */
    public int getIdobra()
    {
        return idobra;
    }

                                              
    /**
     * Set the value of Idobra
     *
     * @param v new value
     */
    public void setIdobra(int v) throws TorqueException
    {
    
                  if (this.idobra != v)
              {
            this.idobra = v;
            setModified(true);
        }
    
          
                                  
                                }
  
    /**
     * Get the Idcliente
     *
     * @return int
     */
    public int getIdcliente()
    {
        return idcliente;
    }

                              
    /**
     * Set the value of Idcliente
     *
     * @param v new value
     */
    public void setIdcliente(int v) throws TorqueException
    {
    
                  if (this.idcliente != v)
              {
            this.idcliente = v;
            setModified(true);
        }
    
                          
                if (aClientes != null && !(aClientes.getIdcliente() == v))
                {
            aClientes = null;
        }
      
              }
  
    /**
     * Get the Numerocontrato
     *
     * @return String
     */
    public String getNumerocontrato()
    {
        return numerocontrato;
    }

                        
    /**
     * Set the value of Numerocontrato
     *
     * @param v new value
     */
    public void setNumerocontrato(String v) 
    {
    
                  if (!ObjectUtils.equals(this.numerocontrato, v))
              {
            this.numerocontrato = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Referencia
     *
     * @return String
     */
    public String getReferencia()
    {
        return referencia;
    }

                        
    /**
     * Set the value of Referencia
     *
     * @param v new value
     */
    public void setReferencia(String v) 
    {
    
                  if (!ObjectUtils.equals(this.referencia, v))
              {
            this.referencia = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Nombre
     *
     * @return String
     */
    public String getNombre()
    {
        return nombre;
    }

                        
    /**
     * Set the value of Nombre
     *
     * @param v new value
     */
    public void setNombre(String v) 
    {
    
                  if (!ObjectUtils.equals(this.nombre, v))
              {
            this.nombre = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Idlocalidad
     *
     * @return int
     */
    public int getIdlocalidad()
    {
        return idlocalidad;
    }

                              
    /**
     * Set the value of Idlocalidad
     *
     * @param v new value
     */
    public void setIdlocalidad(int v) throws TorqueException
    {
    
                  if (this.idlocalidad != v)
              {
            this.idlocalidad = v;
            setModified(true);
        }
    
                          
                if (aLocalidades != null && !(aLocalidades.getIdlocalidad() == v))
                {
            aLocalidades = null;
        }
      
              }
  
    /**
     * Get the Calle
     *
     * @return String
     */
    public String getCalle()
    {
        return calle;
    }

                        
    /**
     * Set the value of Calle
     *
     * @param v new value
     */
    public void setCalle(String v) 
    {
    
                  if (!ObjectUtils.equals(this.calle, v))
              {
            this.calle = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Cp
     *
     * @return String
     */
    public String getCp()
    {
        return cp;
    }

                        
    /**
     * Set the value of Cp
     *
     * @param v new value
     */
    public void setCp(String v) 
    {
    
                  if (!ObjectUtils.equals(this.cp, v))
              {
            this.cp = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Fechaalta
     *
     * @return String
     */
    public String getFechaalta()
    {
        return fechaalta;
    }

                        
    /**
     * Set the value of Fechaalta
     *
     * @param v new value
     */
    public void setFechaalta(String v) 
    {
    
                  if (!ObjectUtils.equals(this.fechaalta, v))
              {
            this.fechaalta = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Fechacomienzo
     *
     * @return String
     */
    public String getFechacomienzo()
    {
        return fechacomienzo;
    }

                        
    /**
     * Set the value of Fechacomienzo
     *
     * @param v new value
     */
    public void setFechacomienzo(String v) 
    {
    
                  if (!ObjectUtils.equals(this.fechacomienzo, v))
              {
            this.fechacomienzo = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Fechafin
     *
     * @return String
     */
    public String getFechafin()
    {
        return fechafin;
    }

                        
    /**
     * Set the value of Fechafin
     *
     * @param v new value
     */
    public void setFechafin(String v) 
    {
    
                  if (!ObjectUtils.equals(this.fechafin, v))
              {
            this.fechafin = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Jornadas
     *
     * @return int
     */
    public int getJornadas()
    {
        return jornadas;
    }

                        
    /**
     * Set the value of Jornadas
     *
     * @param v new value
     */
    public void setJornadas(int v) 
    {
    
                  if (this.jornadas != v)
              {
            this.jornadas = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Observaciones
     *
     * @return String
     */
    public String getObservaciones()
    {
        return observaciones;
    }

                        
    /**
     * Set the value of Observaciones
     *
     * @param v new value
     */
    public void setObservaciones(String v) 
    {
    
                  if (!ObjectUtils.equals(this.observaciones, v))
              {
            this.observaciones = v;
            setModified(true);
        }
    
          
              }
  
      
    
                  
    
        private Clientes aClientes;

    /**
     * Declares an association between this object and a Clientes object
     *
     * @param v Clientes
     * @throws TorqueException
     */
    public void setClientes(Clientes v) throws TorqueException
    {
            if (v == null)
        {
                          setIdcliente( 0);
              }
        else
        {
            setIdcliente(v.getIdcliente());
        }
            aClientes = v;
    }

                                            
    /**
     * Get the associated Clientes object
     *
     * @return the associated Clientes object
     * @throws TorqueException
     */
    public Clientes getClientes() throws TorqueException
    {
        if (aClientes == null && (this.idcliente != 0))
        {
                          aClientes = ClientesPeer.retrieveByPK(SimpleKey.keyFor(this.idcliente));
              
            /* The following can be used instead of the line above to
               guarantee the related object contains a reference
               to this object, but this level of coupling
               may be undesirable in many circumstances.
               As it can lead to a db query with many results that may
               never be used.
               Clientes obj = ClientesPeer.retrieveByPK(this.idcliente);
               obj.addObrass(this);
            */
        }
        return aClientes;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setClientesKey(ObjectKey key) throws TorqueException
    {
      
                        setIdcliente(((NumberKey) key).intValue());
                  }
    
    
                  
    
        private Localidades aLocalidades;

    /**
     * Declares an association between this object and a Localidades object
     *
     * @param v Localidades
     * @throws TorqueException
     */
    public void setLocalidades(Localidades v) throws TorqueException
    {
            if (v == null)
        {
                          setIdlocalidad( 0);
              }
        else
        {
            setIdlocalidad(v.getIdlocalidad());
        }
            aLocalidades = v;
    }

                                            
    /**
     * Get the associated Localidades object
     *
     * @return the associated Localidades object
     * @throws TorqueException
     */
    public Localidades getLocalidades() throws TorqueException
    {
        if (aLocalidades == null && (this.idlocalidad != 0))
        {
                          aLocalidades = LocalidadesPeer.retrieveByPK(SimpleKey.keyFor(this.idlocalidad));
              
            /* The following can be used instead of the line above to
               guarantee the related object contains a reference
               to this object, but this level of coupling
               may be undesirable in many circumstances.
               As it can lead to a db query with many results that may
               never be used.
               Localidades obj = LocalidadesPeer.retrieveByPK(this.idlocalidad);
               obj.addObrass(this);
            */
        }
        return aLocalidades;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setLocalidadesKey(ObjectKey key) throws TorqueException
    {
      
                        setIdlocalidad(((NumberKey) key).intValue());
                  }
       
                                
            
      
    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getUejecucioness(new Criteria())
     *
     * @throws TorqueException
     */
    public List getUejecucioness() throws TorqueException
    {
                  return getUejecucioness(new Criteria(10));
          }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Obras has previously
     * been saved, it will retrieve related Uejecucioness from storage.
     * If this Obras is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getUejecucioness(Criteria criteria) throws TorqueException
    {
                            criteria.add(UejecucionesPeer.IDOBRA, getIdobra());
                            return UejecucionesPeer.doSelect(criteria);
          }

    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getUejecucioness(new Criteria(),Connection)
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getUejecucioness(Connection con) throws TorqueException
    {
                  return getUejecucioness(new Criteria(10), con);
          }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Obras has previously
     * been saved, it will retrieve related Uejecucioness from storage.
     * If this Obras is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getUejecucioness(Criteria criteria, Connection con)
            throws TorqueException
    {
                             criteria.add(UejecucionesPeer.IDOBRA, getIdobra());
                             return UejecucionesPeer.doSelect(criteria, con);
           }

                        
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Obras is new, it will return
     * an empty collection; or if this Obras has previously
     * been saved, it will retrieve related Uejecucioness from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Obras.
     */
    protected List getUejecucionessJoinObras(Criteria criteria)
        throws TorqueException
    {
            
                        criteria.add(UejecucionesPeer.IDOBRA, getIdobra());
                                    return UejecucionesPeer.doSelectJoinObras(criteria);
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Obras is new, it will return
     * an empty collection; or if this Obras has previously
     * been saved, it will retrieve related Uejecucioness from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Obras.
     */
    protected List getUejecucionessJoinSubcapitulos(Criteria criteria)
        throws TorqueException
    {
            
                        criteria.add(UejecucionesPeer.IDOBRA, getIdobra());
                                    return UejecucionesPeer.doSelectJoinSubcapitulos(criteria);
                }
                            


          
    private static List fieldNames = null;

    /**
     * Generate a list of field names.
     *
     * @return a list of field names
     */
    public static synchronized List getFieldNames()
    {
        if (fieldNames == null)
        {
            fieldNames = new ArrayList();
              fieldNames.add("Idobra");
              fieldNames.add("Idcliente");
              fieldNames.add("Numerocontrato");
              fieldNames.add("Referencia");
              fieldNames.add("Nombre");
              fieldNames.add("Idlocalidad");
              fieldNames.add("Calle");
              fieldNames.add("Cp");
              fieldNames.add("Fechaalta");
              fieldNames.add("Fechacomienzo");
              fieldNames.add("Fechafin");
              fieldNames.add("Jornadas");
              fieldNames.add("Observaciones");
              fieldNames = Collections.unmodifiableList(fieldNames);
        }
        return fieldNames;
    }

    /**
     * Retrieves a field from the object by name passed in as a String.
     *
     * @param name field name
     * @return value
     */
    public Object getByName(String name)
    {
          if (name.equals("Idobra"))
        {
                return new Integer(getIdobra());
            }
          if (name.equals("Idcliente"))
        {
                return new Integer(getIdcliente());
            }
          if (name.equals("Numerocontrato"))
        {
                return getNumerocontrato();
            }
          if (name.equals("Referencia"))
        {
                return getReferencia();
            }
          if (name.equals("Nombre"))
        {
                return getNombre();
            }
          if (name.equals("Idlocalidad"))
        {
                return new Integer(getIdlocalidad());
            }
          if (name.equals("Calle"))
        {
                return getCalle();
            }
          if (name.equals("Cp"))
        {
                return getCp();
            }
          if (name.equals("Fechaalta"))
        {
                return getFechaalta();
            }
          if (name.equals("Fechacomienzo"))
        {
                return getFechacomienzo();
            }
          if (name.equals("Fechafin"))
        {
                return getFechafin();
            }
          if (name.equals("Jornadas"))
        {
                return new Integer(getJornadas());
            }
          if (name.equals("Observaciones"))
        {
                return getObservaciones();
            }
          return null;
    }

    /**
     * Retrieves a field from the object by name passed in
     * as a String.  The String must be one of the static
     * Strings defined in this Class' Peer.
     *
     * @param name peer name
     * @return value
     */
    public Object getByPeerName(String name)
    {
          if (name.equals(ObrasPeer.IDOBRA))
        {
                return new Integer(getIdobra());
            }
          if (name.equals(ObrasPeer.IDCLIENTE))
        {
                return new Integer(getIdcliente());
            }
          if (name.equals(ObrasPeer.NUMEROCONTRATO))
        {
                return getNumerocontrato();
            }
          if (name.equals(ObrasPeer.REFERENCIA))
        {
                return getReferencia();
            }
          if (name.equals(ObrasPeer.NOMBRE))
        {
                return getNombre();
            }
          if (name.equals(ObrasPeer.IDLOCALIDAD))
        {
                return new Integer(getIdlocalidad());
            }
          if (name.equals(ObrasPeer.CALLE))
        {
                return getCalle();
            }
          if (name.equals(ObrasPeer.CP))
        {
                return getCp();
            }
          if (name.equals(ObrasPeer.FECHAALTA))
        {
                return getFechaalta();
            }
          if (name.equals(ObrasPeer.FECHACOMIENZO))
        {
                return getFechacomienzo();
            }
          if (name.equals(ObrasPeer.FECHAFIN))
        {
                return getFechafin();
            }
          if (name.equals(ObrasPeer.JORNADAS))
        {
                return new Integer(getJornadas());
            }
          if (name.equals(ObrasPeer.OBSERVACIONES))
        {
                return getObservaciones();
            }
          return null;
    }

    /**
     * Retrieves a field from the object by Position as specified
     * in the xml schema.  Zero-based.
     *
     * @param pos position in xml schema
     * @return value
     */
    public Object getByPosition(int pos)
    {
            if (pos == 0)
        {
                return new Integer(getIdobra());
            }
              if (pos == 1)
        {
                return new Integer(getIdcliente());
            }
              if (pos == 2)
        {
                return getNumerocontrato();
            }
              if (pos == 3)
        {
                return getReferencia();
            }
              if (pos == 4)
        {
                return getNombre();
            }
              if (pos == 5)
        {
                return new Integer(getIdlocalidad());
            }
              if (pos == 6)
        {
                return getCalle();
            }
              if (pos == 7)
        {
                return getCp();
            }
              if (pos == 8)
        {
                return getFechaalta();
            }
              if (pos == 9)
        {
                return getFechacomienzo();
            }
              if (pos == 10)
        {
                return getFechafin();
            }
              if (pos == 11)
        {
                return new Integer(getJornadas());
            }
              if (pos == 12)
        {
                return getObservaciones();
            }
              return null;
    }
     
    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
     *
     * @throws Exception
     */
    public void save() throws Exception
    {
          save(ObrasPeer.getMapBuilder()
                .getDatabaseMap().getName());
      }

    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
       * Note: this code is here because the method body is
     * auto-generated conditionally and therefore needs to be
     * in this file instead of in the super class, BaseObject.
       *
     * @param dbName
     * @throws TorqueException
     */
    public void save(String dbName) throws TorqueException
    {
        Connection con = null;
          try
        {
            con = Transaction.begin(dbName);
            save(con);
            Transaction.commit(con);
        }
        catch(TorqueException e)
        {
            Transaction.safeRollback(con);
            throw e;
        }
      }

      /** flag to prevent endless save loop, if this object is referenced
        by another object which falls in this transaction. */
    private boolean alreadyInSave = false;
      /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.  This method
     * is meant to be used as part of a transaction, otherwise use
     * the save() method and the connection details will be handled
     * internally
     *
     * @param con
     * @throws TorqueException
     */
    public void save(Connection con) throws TorqueException
    {
          if (!alreadyInSave)
        {
            alreadyInSave = true;


  
            // If this object has been modified, then save it to the database.
            if (isModified())
            {
                if (isNew())
                {
                    ObrasPeer.doInsert((Obras) this, con);
                    setNew(false);
                }
                else
                {
                    ObrasPeer.doUpdate((Obras) this, con);
                }
            }

                                      
                
                                  alreadyInSave = false;
        }
      }

                        
      /**
     * Set the PrimaryKey using ObjectKey.
     *
     * @param key idobra ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setIdobra(((NumberKey) key).intValue());
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setIdobra(Integer.parseInt(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getIdobra());
      }
 

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
       * It then fills all the association collections and sets the
     * related objects to isNew=true.
       */
      public Obras copy() throws TorqueException
    {
        return copyInto(new Obras());
    }
  
    protected Obras copyInto(Obras copyObj) throws TorqueException
    {
          copyObj.setIdobra(idobra);
          copyObj.setIdcliente(idcliente);
          copyObj.setNumerocontrato(numerocontrato);
          copyObj.setReferencia(referencia);
          copyObj.setNombre(nombre);
          copyObj.setIdlocalidad(idlocalidad);
          copyObj.setCalle(calle);
          copyObj.setCp(cp);
          copyObj.setFechaalta(fechaalta);
          copyObj.setFechacomienzo(fechacomienzo);
          copyObj.setFechafin(fechafin);
          copyObj.setJornadas(jornadas);
          copyObj.setObservaciones(observaciones);
  
                            copyObj.setIdobra( -1);
                                                                                    
                                      
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public ObrasPeer getPeer()
    {
        return peer;
    }

    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Obras:\n");
        str.append("Idobra = ")
               .append(getIdobra())
             .append("\n");
        str.append("Idcliente = ")
               .append(getIdcliente())
             .append("\n");
        str.append("Numerocontrato = ")
               .append(getNumerocontrato())
             .append("\n");
        str.append("Referencia = ")
               .append(getReferencia())
             .append("\n");
        str.append("Nombre = ")
               .append(getNombre())
             .append("\n");
        str.append("Idlocalidad = ")
               .append(getIdlocalidad())
             .append("\n");
        str.append("Calle = ")
               .append(getCalle())
             .append("\n");
        str.append("Cp = ")
               .append(getCp())
             .append("\n");
        str.append("Fechaalta = ")
               .append(getFechaalta())
             .append("\n");
        str.append("Fechacomienzo = ")
               .append(getFechacomienzo())
             .append("\n");
        str.append("Fechafin = ")
               .append(getFechafin())
             .append("\n");
        str.append("Jornadas = ")
               .append(getJornadas())
             .append("\n");
        str.append("Observaciones = ")
               .append(getObservaciones())
             .append("\n");
        return(str.toString());
    }
    public String getComplexId()
    {
    ArrayList a = new ArrayList();
      	          a.add(Integer.toString(this.getIdobra()));
                return  AjaxUtils.concatenateIdFields(a);
    }
}