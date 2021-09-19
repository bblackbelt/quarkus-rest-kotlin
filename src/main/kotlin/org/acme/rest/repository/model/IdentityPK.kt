package org.acme.rest.repository.model

import java.io.Serializable
import javax.persistence.Embeddable
import javax.persistence.Id
import javax.validation.constraints.Email

@Embeddable
data class IdentityPK(@Id val email: String) : Serializable