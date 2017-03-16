package com.boot.service;

import com.boot.model.Shipwreck;

public interface IShipwreckService {

    public Shipwreck get(Long id);

    public Shipwreck delete(Long id);

    public Shipwreck update(Long id, Shipwreck ship);

    public Shipwreck create(Long id);
}
