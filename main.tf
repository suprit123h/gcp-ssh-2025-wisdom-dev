resource "google_storage_bucket" "default" {
  name = "ssh-2025-wisdom-dev-terraform"
  location = var.region
}

resource "google_storage_bucket" "auto-expire" {
  name          = "auto-expiring-bucket-ssh-2025-wisdom-dev-terraform"
  location      = "US"
  force_destroy = true

  lifecycle_rule {
    condition {
      age = 3
    }
    action {
      type = "Delete"
    }
  }

  lifecycle_rule {
    condition {
      age = 1
    }
    action {
      type = "AbortIncompleteMultipartUpload"
    }
  }
}