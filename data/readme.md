Package structure
:data
└── src/main/java/com/yourpackage/data/
├── local/ # Room/DataStore
│ ├── database/
│ │ ├── AppDatabase.kt
│ │ ├── entities/ # Room entities
│ │ │ ├── TheoryEntity.kt
│ │ │ ├── PracticeEntity.kt
│ │ │ ├── ChatMessageEntity.kt
│ │ │ └── UserEntity.kt
│ │ │
│ │ └── dao/ # DAO interfaces
│ │ ├── TheoryDao.kt
│ │ ├── PracticeDao.kt
│ │ ├── ChatDao.kt
│ │ └── UserDao.kt
│ │
│ └── datastore/ # Для настроек
│ └── AppSettings.kt
│
├── remote/ # Retrofit/API
│ ├── api/
│ │ ├── TheoryApi.kt
│ │ ├── PracticeApi.kt
│ │ ├── ChatApi.kt # Для AI ассистента
│ │ └── ProfileApi.kt
│ │
│ ├── dto/ # DTO объекты
│ │ ├── TheoryDto.kt
│ │ ├── PracticeDto.kt
│ │ ├── ChatRequestDto.kt
│ │ ├── ChatResponseDto.kt
│ │ └── ProfileDto.kt
│ │
│ └── interceptors/
│ ├── AuthInterceptor.kt
│ └── LoggingInterceptor.kt
│
├── repository/ # Реализации репозиториев
│ ├── TheoryRepositoryImpl.kt
│ ├── PracticeRepositoryImpl.kt
│ ├── ChatRepositoryImpl.kt
│ ├── ProfileRepositoryImpl.kt
│ └── SettingsRepositoryImpl.kt
│
└── di/ # DI модули
├── DatabaseModule.kt
├── NetworkModule.kt
└── RepositoryModule.kt