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
 * extended all references should be to Subcapitulos
 */
public abstract class BaseSubcapitulos extends BaseObject
{
    /** The Peer class */
    private static final SubcapitulosPeer peer =
        new SubcapitulosPeer();

                                            
    /** The value for the idsubcapitulo field */
    private int idsubcapitulo = -1;
                                          
    /** The value for the idcapitulo field */
    private int idcapitulo = 0;
                                                
    /** The value for the nombre field */
    private String nombre = "";
                                                
    /** The value for the referencia field */
    private String referencia = "";
  
    
    /**
     * Get the Idsubcapitulo
     *
     * @return int
     */
    public int getIdsubcapitulo()
    {
        return idsubcapitulo;
    }

                                              
    /**
     * Set the value of Idsubcapitulo
     *
     * @param v new value
     */
    public void setIdsubcapitulo(int v) throws TorqueException
    {
    
                  if (this.idsubcapitulo != v)
              {
            this.idsubcapitulo = v;
            setModified(true);
        }
    
          
                                  
                                }
  
    /**
     * Get the Idcapitulo
     *
     * @return int
     */
    public int getIdcapitulo()
    {
        return idcapitulo;
    }

                              
    /**
     * Set the value of Idcapitulo
     *
     * @param v new value
     */
    public void setIdcapitulo(int v) throws TorqueException
    {
    
                  if (this.idcapitulo != v)
              {
            this.idcapitulo = v;
            setModified(true);
        }
    
                          
                if (aCapitulos != null && !(aCapitulos.getIdcapitulo() == v))
                {
            aCapitulos = null;
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
  
      
    
                  
    
        private Capitulos aCapitulos;

    /**
     * Declares an association between this object and a Capitulos object
     *
     * @param v Capitulos
     * @throws TorqueException
     */
    public void setCapitulos(Capitulos v) throws TorqueException
    {
            if (v == null)
        {
                          setIdcapitulo( 0);
              }
        else
        {
            setIdcapitulo(v.getIdcapitulo());
        }
            aCapitulos = v;
    }

                                            
    /**
     * Get the associated Capitulos object
     *
     * @return the associated Capitulos object
     * @throws TorqueException
     */
    public Capitulos getCapitulos() throws TorqueException
    {
        if (aCapitulos == null && (this.idcapitulo != 0))
        {
                          aCapitulos = CapitulosPeer.retrieveByPK(SimpleKey.keyFor(this.idcapitulo));
              
            /* The following can be used instead of the line above to
               guarantee the related object contains a reference
               to this object, but this level of coupling
               may be undesirable in many circumstances.
               As it can lead to a db query with many results that may
               never be used.
               Capitulos obj = CapitulosPeer.retrieveByPK(this.idcapitulo);
               obj.addSubcapituloss(this);
            */
        }
        return aCapitulos;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setCapitulosKey(ObjectKey key) throws TorqueException
    {
      
                        setIdcapitulo(((NumberKey) key).intValue());
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
     * Otherwise if this Subcapitulos has previously
     * been saved, it will retrieve related Uejecucioness from storage.
     * If this Subcapitulos is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getUejecucioness(Criteria criteria) throws TorqueException
    {
                            criteria.add(UejecucionesPeer.IDSUBCAPITULO, getIdsubcapitulo());
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
     * Otherwise if this Subcapitulos has previously
     * been saved, it will retrieve related Uejecucioness from storage.
     * If this Subcapitulos is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getUejecucioness(Criteria criteria, Connection con)
            throws TorqueException
    {
                             criteria.add(UejecucionesPeer.IDSUBCAPITULO, getIdsubcapitulo());
                             return UejecucionesPeer.doSelect(criteria, con);
           }

                        
              
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Subcapitulos is new, it will return
     * an empty collection; or if this Subcapitulos has previously
     * been saved, it will retrieve related Uejecucioness from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Subcapitulos.
     */
    protected List getUejecucionessJoinObras(Criteria criteria)
        throws TorqueException
    {
            
                        criteria.add(UejecucionesPeer.IDSUBCAPITULO, getIdsubcapitulo());
                                    return UejecucionesPeer.doSelectJoinObras(criteria);
                }
                  
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Subcapitulos is new, it will return
     * an empty collection; or if this Subcapitulos has previously
     * been saved, it will retrieve related Uejecucioness from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Subcapitulos.
     */
    protected List getUejecucionessJoinSubcapitulos(Criteria criteria)
        throws TorqueException
    {
            
                        criteria.add(UejecucionesPeer.IDSUBCAPITULO, getIdsubcapitulo());
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
              fieldNames.add("Idsubcapitulo");
              fieldNames.add("Idcapitulo");
              fieldNames.add("Nombre");
              fieldNames.add("Referencia");
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
          if (name.equals("Idsubcapitulo"))
        {
                return new Integer(getIdsubcapitulo());
            }
          if (name.equals("Idcapitulo"))
        {
                return new Integer(getIdcapitulo());
            }
          if (name.equals("Nombre"))
        {
                return getNombre();
            }
          if (name.equals("Referencia"))
        {
                return getReferencia();
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
          if (name.equals(SubcapitulosPeer.IDSUBCAPITULO))
        {
                return new Integer(getIdsubcapitulo());
            }
          if (name.equals(SubcapitulosPeer.IDCAPITULO))
        {
                return new Integer(getIdcapitulo());
            }
          if (name.equals(SubcapitulosPeer.NOMBRE))
        {
                return getNombre();
            }
          if (name.equals(SubcapitulosPeer.REFERENCIA))
        {
                return getReferencia();
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
                return new Integer(getIdsubcapitulo());
            }
              if (pos == 1)
        {
                return new Integer(getIdcapitulo());
            }
              if (pos == 2)
        {
                return getNombre();
            }
              if (pos == 3)
        {
                return getReferencia();
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
          save(SubcapitulosPeer.getMapBuilder()
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
                    SubcapitulosPeer.doInsert((Subcapitulos) this, con);
                    setNew(false);
                }
                else
                {
                    SubcapitulosPeer.doUpdate((Subcapitulos) this, con);
                }
            }

                                      
                
                                  alreadyInSave = false;
        }
      }

                        
      /**
     * Set the PrimaryKey using ObjectKey.
     *
     * @param key idsubcapitulo ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setIdsubcapitulo(((NumberKey) key).intValue());
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setIdsubcapitulo(Integer.parseInt(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getIdsubcapitulo());
      }
 

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
       * It then fills all the association collections and sets the
     * related objects to isNew=true.
       */
      public Subcapitulos copy() throws TorqueException
    {
        return copyInto(new Subcapitulos());
    }
  
    protected Subcapitulos copyInto(Subcapitulos copyObj) throws TorqueException
    {
          copyObj.setIdsubcapitulo(idsubcapitulo);
          copyObj.setIdcapitulo(idcapitulo);
          copyObj.setNombre(nombre);
          copyObj.setReferencia(referencia);
  
                            copyObj.setIdsubcapitulo( -1);
                              
                                      
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public SubcapitulosPeer getPeer()
    {
        return peer;
    }

    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Subcapitulos:\n");
        str.append("Idsubcapitulo = ")
               .append(getIdsubcapitulo())
             .append("\n");
        str.append("Idcapitulo = ")
               .append(getIdcapitulo())
             .append("\n");
        str.append("Nombre = ")
               .append(getNombre())
             .append("\n");
        str.append("Referencia = ")
               .append(getReferencia())
             .append("\n");
        return(str.toString());
    }
    public String getComplexId()
    {
    ArrayList a = new ArrayList();
      	          a.add(Integer.toString(this.getIdsubcapitulo()));
                return  AjaxUtils.concatenateIdFields(a);
    }
}