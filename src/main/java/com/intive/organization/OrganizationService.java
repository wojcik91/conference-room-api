package com.intive.organization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    public List<Organization> getAllOrganizations() {

        List<Organization> organizations = new ArrayList<>();
        organizationRepository.findAll().forEach(organizations::add);
        return organizations;
    }

    public Optional<Organization> getOrganization(String id) {
        return organizationRepository.findById(id);
    }

    public void addOrganization(Organization organization) {
        organizationRepository.save(organization);
    }

    public void updateOrganization(Organization organization) {
        organizationRepository.save(organization);
    }

    public void deleteOrganization(String id) {
        organizationRepository.deleteById(id);
    }
}
