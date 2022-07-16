package com.demo.services;

import com.demo.entities_api.RoleApi;

import java.util.List;

public interface IBookingService {
    public List<RoleApi> findall();
    public RoleApi findByRoleId(int roleApi_id);
    public boolean create(RoleApi roleApi);
    public boolean update(RoleApi roleApi);
    public boolean delete(Integer id);
    public List<RoleApi> findallrolewithsort(String field);

    public List<RoleApi> findallpaginate(int offset, int no);
}
