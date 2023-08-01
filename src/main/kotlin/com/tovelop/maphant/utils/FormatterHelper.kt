package com.tovelop.maphant.utils

import java.time.LocalDateTime
import java.time.ZoneOffset
import kotlin.time.microseconds

class FormatterHelper {
    companion object {
        fun LocalDateTime.formatTime(): String {
            val now = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
            val secDiff = now - this.toEpochSecond(ZoneOffset.UTC);

            if (secDiff < 60) {
                return "방금전"
            }

            val diffMin = secDiff / 60
            if (diffMin < 60)
                return "${diffMin}분 전"

            val diffHour = diffMin / 60
            if (diffHour < 24)
                return "${diffHour}시간 전"

            val diffDay = diffHour / 60;
            if (diffDay < 7)
                return "${diffDay}일 전";

            val diffWeek = diffDay / 7;
            if (diffWeek < 4)
                return "${diffWeek}주 전";

            return "오래 됨"
        }
    }
}