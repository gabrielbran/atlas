/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orkestic.atlas.services;

import com.orkestic.atlas.services.exception.PluginException;

/**
 *
 * @author gbran
 */
public interface Plugin {

    <Response, Request> Response resolve(Request request)
            throws PluginException;

    void onPreResolve();

    void onRelease();

    String getDescriptor();

    boolean isController();
}
