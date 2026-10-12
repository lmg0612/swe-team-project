# 소프트웨어공학 팀 프로젝트 — Android 앱

> 2024-2 소프트웨어공학 팀 프로젝트 · 2024.11

## 개요
Kotlin 기반 Android 앱의 기본 구조를 설계한 팀 프로젝트입니다. 하단 내비게이션(Bottom Navigation)과 Jetpack Navigation, MVVM(Fragment + ViewModel) 구조로 화면을 구성했습니다.

## 구조
```
app/src/main/java/com/example/real_project/
├─ MainActivity.kt
└─ ui/
   ├─ home/           HomeFragment, HomeViewModel
   ├─ dashboard/      DashboardFragment, DashboardViewModel
   ├─ notifications/  NotificationsFragment, NotificationsViewModel
   └─ test/           TestFragment, TestViewModel   # 추가한 화면
app/src/main/res/
├─ navigation/mobile_navigation.xml
├─ menu/bottom_nav_menu.xml
└─ layout/  (activity_main, fragment_*)
```

## 기술
Kotlin · Android SDK · Jetpack Navigation · ViewModel/LiveData · Gradle (Kotlin DSL)

## 실행
Android Studio에서 폴더를 열고 Gradle Sync 후 실행
