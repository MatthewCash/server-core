{
    description = "Server Core Minecraft Plugin";

    inputs = {
        nixpkgs.url = "nixpkgs/nixos-unstable";
        flake-utils.url = "github:numtide/flake-utils";
    };

    outputs = inputs @ { self, nixpkgs, flake-utils, ... }:
    flake-utils.lib.eachDefaultSystem (system:
        let pkgs = nixpkgs.legacyPackages.${system}; in rec {
            devShell = pkgs.mkShell rec {
                name = "server-core";
                packages = with pkgs; [
                    gradle
                ];
            };
        }
    );
}
