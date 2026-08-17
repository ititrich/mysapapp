package com.example.app

import androidx.compose.runtime.mutableStateListOf

data class Consultation(
    val id: Long,
    val name: String,
    val phone: String,
    val email: String,
    val details: String,
    val isRegistered: Boolean,
    val hasBook: Boolean
)

class ConsultationRepository {
    private var nextId = 1L

    val consultations = mutableStateListOf(
        Consultation(nextId++, "김태현", "010-1234-5678", "", "ABAP 과정 문의", isRegistered = true, hasBook = true),
        Consultation(nextId++, "이서연", "010-9876-5432", "", "FI/CO 모듈 교육 일정 확인", isRegistered = false, hasBook = false),
        Consultation(nextId++, "박지훈", "010-4567-8901", "", "MM 과정 수강료 문의", isRegistered = true, hasBook = false),
        Consultation(nextId++, "정민우", "010-3333-4444", "", "SD 과정 취업 연계 상담", isRegistered = false, hasBook = false)
    )

    fun add(
        name: String,
        phone: String,
        email: String,
        details: String,
        isRegistered: Boolean,
        hasBook: Boolean
    ) {
        consultations.add(
            0,
            Consultation(nextId++, name, phone, email, details, isRegistered, hasBook)
        )
    }
}
