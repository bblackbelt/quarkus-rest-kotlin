package org.acme.rest.repository

import io.quarkus.hibernate.orm.panache.PanacheRepository
import org.acme.rest.repository.model.IdentityEntity
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class IdentityRepository : PanacheRepository<IdentityEntity> {
}