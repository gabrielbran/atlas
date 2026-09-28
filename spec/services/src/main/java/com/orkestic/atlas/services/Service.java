/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orkestic.atlas.services;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import jakarta.enterprise.util.Nonbinding;
import jakarta.inject.Qualifier;

/**
 * La anotacion <code>@Service</code> permite registrar componentes para
 * extender las funcionalidades del modulo de servicios a traves de inyeccion de
 * dependencias.
 *
 * @author gbran
 */
@Qualifier
@Retention(RUNTIME)
@Target({METHOD, FIELD, PARAMETER, TYPE})
public @interface Service {

    /**
     * Identificador del plugin en el sistema.
     *
     * @return nombre del servicio en el contexto de ejecucion.
     */
    String name();

    /**
     * Version en la que se publico el plugin.
     *
     * No puede haber mas de una version del servicio desplegada.
     *
     * @return version del plugin.
     */
    String version();

    /**
     * Descripcion de la funcionalidad del plugin.
     *
     * @return descripcion de la funcionalidad
     */
    @Nonbinding
    String description() default "";
}
