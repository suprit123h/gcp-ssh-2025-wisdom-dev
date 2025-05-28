module "gcs_bucket" {
  source              = "git@github.com:suprit123h/terraform-modules-bucket.git"
  ./terraform-modules/gcs-bucket"
  bucket_name         = "my-gcs-bucket-ssh-2025"
  location            = "us-central1"
  storage_class       = "STANDARD"
  versioning_enabled  = true
  object_lifecycle_days = 60
}
