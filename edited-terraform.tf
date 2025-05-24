# terraform {
#   required_providers {
#     google = {
#       source  = "hashicorp/google"
#       version = "~> 4.0" # OIDC https://github.com/hashicorp/terraform-provider-google/releases/tag/v3.61.0
#     }
#   }

#   backend "gcs" {
#     bucket = "ssh-2025-wisdom-dev-terraform" # need to update with the bucket name
#     prefix = "state"
#   }

# }

# provider "google" {
#   project = var.project
#   region  = var.region
#   zone    = var.zone
# }


# resource "google_compute_instance" "default" {
#   # provider = google
#   name = "default"
#   machine_type = "e2-micro"
#   network_interface {
#     network = "default"
#   }

#   boot_disk {
#     initialize_params {
#       image = "ubuntu-os-cloud/ubuntu-2004-focal-v20220712"
#     }
#   }
#   # Some changes require full VM restarts
#   # consider disabling this flag in production
#   #   depending on your needs
#   allow_stopping_for_update = true
# }