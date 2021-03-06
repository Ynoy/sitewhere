/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.rules.spi.microservice;

import com.sitewhere.grpc.client.spi.client.IDeviceEventManagementApiChannel;
import com.sitewhere.grpc.client.spi.client.IDeviceManagementApiChannel;
import com.sitewhere.spi.device.IDeviceManagement;
import com.sitewhere.spi.microservice.MicroserviceIdentifier;
import com.sitewhere.spi.microservice.multitenant.IMultitenantMicroservice;

/**
 * Microservice that provides rule processing functionality.
 * 
 * @author Derek
 */
public interface IRuleProcessingMicroservice
	extends IMultitenantMicroservice<MicroserviceIdentifier, IRuleProcessingTenantEngine> {

    /**
     * Get device management API channel.
     * 
     * @return
     */
    public IDeviceManagementApiChannel<?> getDeviceManagementApiChannel();

    /**
     * Caching wrapper around device management API channel.
     * 
     * @return
     */
    public IDeviceManagement getCachedDeviceManagement();

    /**
     * Get event management API channel.
     * 
     * @return
     */
    public IDeviceEventManagementApiChannel<?> getDeviceEventManagementApiChannel();
}