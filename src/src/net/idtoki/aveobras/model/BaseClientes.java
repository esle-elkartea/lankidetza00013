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
 * extended all references should be to Clientes
 */
public abstract class BaseClientes extends BaseObject
{
    /** The Peer class */
    private static final ClientesPeer peer =
        new ClientesPeer();

                                            
    /** The value for the idcliente field */
    private int idcliente = -1;
                                                
    /** The value for the cif field */
    private String cif = "";
                                                
    /** The value for the fechaalta field */
    private String fechaalta = "";
                                                
    /** The value for the fechabaja field */
    private String fechabaja = "";
                                                
    /** The value for the nombre field */
    private String nombre = "";
                                                
    /** The value for the razonsocial field */
    private String razonsocial = "";
                                                
    /** The value for the referencia field */
    private String referencia = "";
                                                
    /** The value for the contacto field */
    private String contacto = "";
                                          
    /** The value for the idlocalidad field */
    private int idlocalidad = 0;
                                                
    /** The value for the direccion field */
    private String direccion = "";
                                                
    /** The value for the cp field */
    private String cp = "";
                                                
    /** The value for the telefono field */
    private String telefono = "";
                                                
    /** The value for the fax field */
    private String fax = "";
                                                
    /** The value for the movil field */
    private String movil = "";
                                                
    /** The value for the email field */
    private String email = "";
                                                
    /** The value for the www field */
    private String www = "";
                                                
    /** The value for the observaciones field */
    private String observaciones = "";
  
    
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
    
          
                                  
                                }
  
    /**
     * Get the Cif
     *
     * @return String
     */
    public String getCif()
    {
        return cif;
    }

                        
    /**
     * Set the value of Cif
     *
     * @param v new value
     */
    public void setCif(String v) 
    {
    
                  if (!ObjectUtils.equals(this.cif, v))
              {
            this.cif = v;
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
     * Get the Fechabaja
     *
     * @return String
     */
    public String getFechabaja()
    {
        return fechabaja;
    }

                        
    /**
     * Set the value of Fechabaja
     *
     * @param v new value
     */
    public void setFechabaja(String v) 
    {
    
                  if (!ObjectUtils.equals(this.fechabaja, v))
              {
            this.fechabaja = v;
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
     * Get the Razonsocial
     *
     * @return String
     */
    public String getRazonsocial()
    {
        return razonsocial;
    }

                        
    /**
     * Set the value of Razonsocial
     *
     * @param v new value
     */
    public void setRazonsocial(String v) 
    {
    
                  if (!ObjectUtils.equals(this.razonsocial, v))
              {
            this.razonsocial = v;
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
     * Get the Contacto
     *
     * @return String
     */
    public String getContacto()
    {
        return contacto;
    }

                        
    /**
     * Set the value of Contacto
     *
     * @param v new value
     */
    public void setContacto(String v) 
    {
    
                  if (!ObjectUtils.equals(this.contacto, v))
              {
            this.contacto = v;
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
     * Get the Direccion
     *
     * @return String
     */
    public String getDireccion()
    {
        return direccion;
    }

                        
    /**
     * Set the value of Direccion
     *
     * @param v new value
     */
    public void setDireccion(String v) 
    {
    
                  if (!ObjectUtils.equals(this.direccion, v))
              {
            this.direccion = v;
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
     * Get the Telefono
     *
     * @return String
     */
    public String getTelefono()
    {
        return telefono;
    }

                        
    /**
     * Set the value of Telefono
     *
     * @param v new value
     */
    public void setTelefono(String v) 
    {
    
                  if (!ObjectUtils.equals(this.telefono, v))
              {
            this.telefono = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Fax
     *
     * @return String
     */
    public String getFax()
    {
        return fax;
    }

                        
    /**
     * Set the value of Fax
     *
     * @param v new value
     */
    public void setFax(String v) 
    {
    
                  if (!ObjectUtils.equals(this.fax, v))
              {
            this.fax = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Movil
     *
     * @return String
     */
    public String getMovil()
    {
        return movil;
    }

                        
    /**
     * Set the value of Movil
     *
     * @param v new value
     */
    public void setMovil(String v) 
    {
    
                  if (!ObjectUtils.equals(this.movil, v))
              {
            this.movil = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Email
     *
     * @return String
     */
    public String getEmail()
    {
        return email;
    }

                        
    /**
     * Set the value of Email
     *
     * @param v new value
     */
    public void setEmail(String v) 
    {
    
                  if (!ObjectUtils.equals(this.email, v))
              {
            this.email = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Www
     *
     * @return String
     */
    public String getWww()
    {
        return www;
    }

                        
    /**
     * Set the value of Www
     *
     * @param v new value
     */
    public void setWww(String v) 
    {
    
                  if (!ObjectUtils.equals(this.www, v))
              {
            this.www = v;
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
               obj.addClientess(this);
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
     * getObrass(new Criteria())
     *
     * @throws TorqueException
     */
    public List getObrass() throws TorqueException
    {
                  return getObrass(new Criteria(10));
          }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Clientes has previously
     * been saved, it will retrieve related Obrass from storage.
     * If this Clientes is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getObrass(Criteria criteria) throws TorqueException
    {
                            criteria.add(ObrasPeer.IDCLIENTE, getIdcliente());
                            return ObrasPeer.doSelect(criteria);
          }

    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getObrass(new Criteria(),Connection)
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getObrass(Connection con) throws TorqueException
    {
                  return getObrass(new Criteria(10), con);
          }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Clientes has previously
     * been saved, it will retrieve related Obrass from storage.
     * If this Clientes is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getObrass(Criteria criteria, Connection con)
            throws TorqueException
    {
                             criteria.add(ObrasPeer.IDCLIENTE, getIdcliente());
                             return ObrasPeer.doSelect(criteria, con);
           }

                        
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Clientes is new, it will return
     * an empty collection; or if this Clientes has previously
     * been saved, it will retrieve related Obrass from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Clientes.
     */
    protected List getObrassJoinClientes(Criteria criteria)
        throws TorqueException
    {
            
                        criteria.add(ObrasPeer.IDCLIENTE, getIdcliente());
                                    return ObrasPeer.doSelectJoinClientes(criteria);
                }
                  
                    
                    
                                
                                                              
                                        
                    
                    
          
    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Clientes is new, it will return
     * an empty collection; or if this Clientes has previously
     * been saved, it will retrieve related Obrass from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Clientes.
     */
    protected List getObrassJoinLocalidades(Criteria criteria)
        throws TorqueException
    {
            
                        criteria.add(ObrasPeer.IDCLIENTE, getIdcliente());
                                    return ObrasPeer.doSelectJoinLocalidades(criteria);
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
              fieldNames.add("Idcliente");
              fieldNames.add("Cif");
              fieldNames.add("Fechaalta");
              fieldNames.add("Fechabaja");
              fieldNames.add("Nombre");
              fieldNames.add("Razonsocial");
              fieldNames.add("Referencia");
              fieldNames.add("Contacto");
              fieldNames.add("Idlocalidad");
              fieldNames.add("Direccion");
              fieldNames.add("Cp");
              fieldNames.add("Telefono");
              fieldNames.add("Fax");
              fieldNames.add("Movil");
              fieldNames.add("Email");
              fieldNames.add("Www");
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
          if (name.equals("Idcliente"))
        {
                return new Integer(getIdcliente());
            }
          if (name.equals("Cif"))
        {
                return getCif();
            }
          if (name.equals("Fechaalta"))
        {
                return getFechaalta();
            }
          if (name.equals("Fechabaja"))
        {
                return getFechabaja();
            }
          if (name.equals("Nombre"))
        {
                return getNombre();
            }
          if (name.equals("Razonsocial"))
        {
                return getRazonsocial();
            }
          if (name.equals("Referencia"))
        {
                return getReferencia();
            }
          if (name.equals("Contacto"))
        {
                return getContacto();
            }
          if (name.equals("Idlocalidad"))
        {
                return new Integer(getIdlocalidad());
            }
          if (name.equals("Direccion"))
        {
                return getDireccion();
            }
          if (name.equals("Cp"))
        {
                return getCp();
            }
          if (name.equals("Telefono"))
        {
                return getTelefono();
            }
          if (name.equals("Fax"))
        {
                return getFax();
            }
          if (name.equals("Movil"))
        {
                return getMovil();
            }
          if (name.equals("Email"))
        {
                return getEmail();
            }
          if (name.equals("Www"))
        {
                return getWww();
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
          if (name.equals(ClientesPeer.IDCLIENTE))
        {
                return new Integer(getIdcliente());
            }
          if (name.equals(ClientesPeer.CIF))
        {
                return getCif();
            }
          if (name.equals(ClientesPeer.FECHAALTA))
        {
                return getFechaalta();
            }
          if (name.equals(ClientesPeer.FECHABAJA))
        {
                return getFechabaja();
            }
          if (name.equals(ClientesPeer.NOMBRE))
        {
                return getNombre();
            }
          if (name.equals(ClientesPeer.RAZONSOCIAL))
        {
                return getRazonsocial();
            }
          if (name.equals(ClientesPeer.REFERENCIA))
        {
                return getReferencia();
            }
          if (name.equals(ClientesPeer.CONTACTO))
        {
                return getContacto();
            }
          if (name.equals(ClientesPeer.IDLOCALIDAD))
        {
                return new Integer(getIdlocalidad());
            }
          if (name.equals(ClientesPeer.DIRECCION))
        {
                return getDireccion();
            }
          if (name.equals(ClientesPeer.CP))
        {
                return getCp();
            }
          if (name.equals(ClientesPeer.TELEFONO))
        {
                return getTelefono();
            }
          if (name.equals(ClientesPeer.FAX))
        {
                return getFax();
            }
          if (name.equals(ClientesPeer.MOVIL))
        {
                return getMovil();
            }
          if (name.equals(ClientesPeer.EMAIL))
        {
                return getEmail();
            }
          if (name.equals(ClientesPeer.WWW))
        {
                return getWww();
            }
          if (name.equals(ClientesPeer.OBSERVACIONES))
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
                return new Integer(getIdcliente());
            }
              if (pos == 1)
        {
                return getCif();
            }
              if (pos == 2)
        {
                return getFechaalta();
            }
              if (pos == 3)
        {
                return getFechabaja();
            }
              if (pos == 4)
        {
                return getNombre();
            }
              if (pos == 5)
        {
                return getRazonsocial();
            }
              if (pos == 6)
        {
                return getReferencia();
            }
              if (pos == 7)
        {
                return getContacto();
            }
              if (pos == 8)
        {
                return new Integer(getIdlocalidad());
            }
              if (pos == 9)
        {
                return getDireccion();
            }
              if (pos == 10)
        {
                return getCp();
            }
              if (pos == 11)
        {
                return getTelefono();
            }
              if (pos == 12)
        {
                return getFax();
            }
              if (pos == 13)
        {
                return getMovil();
            }
              if (pos == 14)
        {
                return getEmail();
            }
              if (pos == 15)
        {
                return getWww();
            }
              if (pos == 16)
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
          save(ClientesPeer.getMapBuilder()
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
                    ClientesPeer.doInsert((Clientes) this, con);
                    setNew(false);
                }
                else
                {
                    ClientesPeer.doUpdate((Clientes) this, con);
                }
            }

                                      
                
                                  alreadyInSave = false;
        }
      }

                        
      /**
     * Set the PrimaryKey using ObjectKey.
     *
     * @param key idcliente ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        throws TorqueException
    {
            setIdcliente(((NumberKey) key).intValue());
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
            setIdcliente(Integer.parseInt(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getIdcliente());
      }
 

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
       * It then fills all the association collections and sets the
     * related objects to isNew=true.
       */
      public Clientes copy() throws TorqueException
    {
        return copyInto(new Clientes());
    }
  
    protected Clientes copyInto(Clientes copyObj) throws TorqueException
    {
          copyObj.setIdcliente(idcliente);
          copyObj.setCif(cif);
          copyObj.setFechaalta(fechaalta);
          copyObj.setFechabaja(fechabaja);
          copyObj.setNombre(nombre);
          copyObj.setRazonsocial(razonsocial);
          copyObj.setReferencia(referencia);
          copyObj.setContacto(contacto);
          copyObj.setIdlocalidad(idlocalidad);
          copyObj.setDireccion(direccion);
          copyObj.setCp(cp);
          copyObj.setTelefono(telefono);
          copyObj.setFax(fax);
          copyObj.setMovil(movil);
          copyObj.setEmail(email);
          copyObj.setWww(www);
          copyObj.setObservaciones(observaciones);
  
                            copyObj.setIdcliente( -1);
                                                                                                            
                                      
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public ClientesPeer getPeer()
    {
        return peer;
    }

    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Clientes:\n");
        str.append("Idcliente = ")
               .append(getIdcliente())
             .append("\n");
        str.append("Cif = ")
               .append(getCif())
             .append("\n");
        str.append("Fechaalta = ")
               .append(getFechaalta())
             .append("\n");
        str.append("Fechabaja = ")
               .append(getFechabaja())
             .append("\n");
        str.append("Nombre = ")
               .append(getNombre())
             .append("\n");
        str.append("Razonsocial = ")
               .append(getRazonsocial())
             .append("\n");
        str.append("Referencia = ")
               .append(getReferencia())
             .append("\n");
        str.append("Contacto = ")
               .append(getContacto())
             .append("\n");
        str.append("Idlocalidad = ")
               .append(getIdlocalidad())
             .append("\n");
        str.append("Direccion = ")
               .append(getDireccion())
             .append("\n");
        str.append("Cp = ")
               .append(getCp())
             .append("\n");
        str.append("Telefono = ")
               .append(getTelefono())
             .append("\n");
        str.append("Fax = ")
               .append(getFax())
             .append("\n");
        str.append("Movil = ")
               .append(getMovil())
             .append("\n");
        str.append("Email = ")
               .append(getEmail())
             .append("\n");
        str.append("Www = ")
               .append(getWww())
             .append("\n");
        str.append("Observaciones = ")
               .append(getObservaciones())
             .append("\n");
        return(str.toString());
    }
    public String getComplexId()
    {
    ArrayList a = new ArrayList();
      	          a.add(Integer.toString(this.getIdcliente()));
                return  AjaxUtils.concatenateIdFields(a);
    }
}
