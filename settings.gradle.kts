pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Dev AssistantAI"
include(":app")
include(":data")
include(":core")
include(":feature")
include(":core:ui-theme")
include(":core:ai-sdk")
include(":core:common")
include(":data:user")
include(":feature:ai-chat")
include(":feature:quiz")
include(":feature:theory")
include(":feature:settings")

project(":core:ui-theme").projectDir = file("core/ui-theme")
project(":core:ai-sdk").projectDir = file("core/ai-sdk")
project(":core:common").projectDir = file("core/common")
project(":data:user").projectDir = file("data/user")
project(":feature:ai-chat").projectDir = file("feature/ai-chat")
project(":feature:quiz").projectDir = file("feature/quiz")
project(":feature:theory").projectDir = file("feature/theory")
project(":feature:settings").projectDir = file("feature/settings")
include(":feature:base")
