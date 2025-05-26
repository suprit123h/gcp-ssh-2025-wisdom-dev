terraform {
  required_providers {
    google = {
      source = "hashicorp/google"
      version = "6.26.0"
    }
  }
}

provider "google" {
  project = var.project
  region   = var.region
  zone     = var.zone
  credentials = file("ssh-devops1-dev-2025.json")
 # credentials = file("ssh-devops1-dev-2025-9684dfcf3b32.json")
}
