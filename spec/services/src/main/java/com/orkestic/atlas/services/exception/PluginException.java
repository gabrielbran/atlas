/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orkestic.atlas.services.exception;

import jakarta.ejb.ApplicationException;

/**
 *
 * @author gbran
 */
@ApplicationException(rollback = true)
public class PluginException extends Throwable {

    public PluginException(String message) {
        super(message);
    }

}
