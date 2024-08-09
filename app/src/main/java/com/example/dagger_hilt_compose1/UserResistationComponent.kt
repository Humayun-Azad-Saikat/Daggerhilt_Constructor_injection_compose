package com.example.dagger_hilt_compose1

import dagger.Component

@Component
interface UserResistationComponent {

    fun userResistation():UserResistationService
}