module "gcs_bucket" {
  source        = "git@github.com:suprit123h/terraform-modules-bucket.git"
  bucket_name   = var.config["bucket_name"]
  location      = var.config["location"]
  storage_class = var.config["storage_class"]
}
