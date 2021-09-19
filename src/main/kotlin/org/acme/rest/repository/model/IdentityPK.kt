package org.acme.rest.repository.model

import java.io.Serializable
import javax.validation.constraints.Email

data class IdentityPK(@Email val email: String) : Serializable