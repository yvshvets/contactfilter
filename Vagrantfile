
Vagrant.configure(2) do |config|

  config.vm.box = "ubuntu/trusty64"
	
  config.vm.provider "virtualbox" do |vb|
    vb.memory = "2048"
    vb.cpus = "2"
end
   
   config.vm.provision "shell", path: "provision.sh"
   config.vm.network "private_network", ip: "192.168.28.12"
end
