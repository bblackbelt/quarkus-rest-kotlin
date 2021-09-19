package org.acme.rest.repository.model

import io.quarkus.hibernate.orm.panache.PanacheEntityBase
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass
import javax.persistence.Table

@Entity
@Table(name = "Identity")
@IdClass(IdentityPK::class)
class IdentityEntity(@Id val email: String, val name: String, val surname: String) : PanacheEntityBase()