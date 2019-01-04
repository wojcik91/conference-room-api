package com.intive.organization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @RequestMapping("/organizations")
    public List<Organization> getAllOrganizations() {
        return organizationService.getAllOrganizations();
    }

    @RequestMapping("/organizations/{id}")
    public Optional<Organization> getOrganization(@PathVariable Long id) {
        return organizationService.getOrganization(id);
    }

    @RequestMapping(value = "/organizations", method = RequestMethod.POST)
    public void addOrganization(@RequestBody Organization organization) {
        organizationService.addOrganization(organization);
    }

    @RequestMapping(value = "/organizations/{id}", method = RequestMethod.PUT)
    public void updateOrganization(@RequestBody Organization organization) {
        organizationService.updateOrganization(organization);
    }

    @RequestMapping(value = "/organizations/{id}", method = RequestMethod.DELETE)
    public void deleteOrganization(@PathVariable Long id) {
        organizationService.deleteOrganization(id);
    }
