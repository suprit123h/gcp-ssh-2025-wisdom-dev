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
}

resource "google_storage_bucket" "default" {
  name = "ssh-2025-wisdom-dev-terraform"
  location = var.region
}