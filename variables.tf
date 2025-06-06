variable "config" {
  default = "${yamldecode(file("data/ssh-devops1-dev-2025.yaml"))["workspaces"][terraform.workspace]}"
}

variable "project" {
  type    = string
  default = "ssh-devops1-dev-2025"
}

variable "region" {
  type    = string
  default = "asia-south1"
}

variable "zone" {
  type    = string
  default = "asia-south1-a"
}
