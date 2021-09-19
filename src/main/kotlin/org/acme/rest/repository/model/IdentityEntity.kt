package org.acme.rest.repository.model

import io.quarkus.hibernate.orm.panache.PanacheEntity
import javax.persistence.Entity
import javax.persistence.IdClass

@Entity
@IdClass(IdentityPK::class)
class IdentityEntity(val name: String, val surname: String) : PanacheEntity()