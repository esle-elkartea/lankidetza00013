package net.idtoki.aveobras.controller;

import net.zylk.web.controller.BaseController;
import java.util.logging.Logger;

/**
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Wed Apr 19 12:33:52 CEST 2006]
 *
 *  You should add additional methods to this class to meet the
 *  application requirements.  This class will only be generated as
 *  long as it does not already exist in the output directory.
 */
public class AppController extends BaseController
{
 private static final Logger logger = Logger.getLogger("net.idtoki.aveobras.controller.AppController");

 public void init()
 {
  super.init();
  //Aqui se registran los metodos que no se quieran repetir de otros sitios.
  //por ejemplo igual quieres tener los metodos de generacion de ajax
  // en un paquete aparte y no copiarlos por aqui,  sino tenerlos disponibles
  //para todas las aplicaciones sin repetirlos en todos los sitios, pues los registras
  //y punto!!
 }

 //Los metodos que se quieran compartir entre todos los controllers se pueden poner aqui,
 //no hace falta registrarlos.
 // por ejemplo el de la grid o cualquier otro que sea especial a la app pero no a cada controller.
}


