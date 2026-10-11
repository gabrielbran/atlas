/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orkestic.atlas.services.extension;

import com.orkestic.atlas.services.exception.PluginException;
import com.orkestic.atlas.services.expose.Request;
import com.orkestic.atlas.services.expose.Response;

/**
 *
 * @author gbran
 */
public interface Plugin {

    Response resolve(Request request) throws PluginException;

    void onPreResolve();

    void onPreRelease();

    String getDescriptor();

    boolean isController();
}
