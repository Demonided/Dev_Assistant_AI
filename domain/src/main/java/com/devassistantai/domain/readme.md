Package structure
:domain
└── src/main/java/com/yourpackage/domain/
├── model/ # Все модели в одном месте
│ ├── Theory.kt
│ ├── Practice.kt
│ ├── ChatMessage.kt
│ ├── UserProfile.kt
│ └── AppSettings.kt
│
├── repository/ # Интерфейсы репозиториев
│ ├── TheoryRepository.kt
│ ├── PracticeRepository.kt
│ ├── ChatRepository.kt
│ ├── ProfileRepository.kt
│ └── SettingsRepository.kt
│
└── usecase/ # Use cases
├── theory/
│ ├── GetTheoryUseCase.kt
│ ├── CompleteTheoryUseCase.kt
│ └── SearchTheoryUseCase.kt
│
├── practice/
│ ├── GetPracticeUseCase.kt
│ ├── SubmitPracticeUseCase.kt
│ └── CheckSolutionUseCase.kt
│
├── chat/
│ ├── SendMessageUseCase.kt
│ ├── GetChatHistoryUseCase.kt
│ └── ClearChatUseCase.kt
│
└── profile/
├── GetProfileUseCase.kt
├── UpdateProfileUseCase.kt
└── DeleteAccountUseCase.kt