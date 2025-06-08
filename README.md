## 🍽️ BiteFlix
BiteFlix is a modern Android recipe app built with Jetpack Compose, powered by TheMealDB API, and spiced with Retrofit, ViewModel, and Coil. It fetches and displays a list of meal categories with images in a sleek, grid-based UI.
## Features
- 📦 Jetpack Compose UI — clean, declarative UI with Material3

- 🌐 API Integration — fetches meal categories from TheMealDB

- 📷 Image Loading — smooth thumbnail rendering with Coil

- 🔁 MVVM Architecture — organized logic using ViewModel

- 🚀 Coroutines for asynchronous data fetching

## Tech Stack
| Layer        | Tech                        |
| ------------ | --------------------------- |
| Language     | Kotlin                      |
| UI           | Jetpack Compose, Material 3 |
| Networking   | Retrofit + Gson             |
| Image Loader | Coil                        |
| State Mgmt   | ViewModel, LiveData         |

## Preview
![Screenshot_20250608_230321](https://github.com/user-attachments/assets/676d102c-d9a9-49c3-80a5-6a68c714db21)

## API Used
- TheMealDB: Free public API for meals and recipes
- Endpoint used: `https://www.themealdb.com/api/json/v1/1/categories.php`

## Acknowledgements
- TheMealDB for the API
- Jetpack Compose
- Coil
- Retrofit

## To Do (Feel free to extend!)
- Show individual meals per category
- Add search functionality
- Add recipe detail screen
- Dark mode toggle
- Favorites

