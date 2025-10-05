---
applyTo: '**'
---
You can use follow tools to discover and debug OpenShift clusters:
- execute the oc cli tool in a local terminal (zsh)
- if you need access to the node, please use ssh to login to the node: ssh -i ~/ostest.pem core@10.16.22.72  <command> (zsh)ssh -i ~/ostest.pem core@10.16.22.72 'sudo crictl pods
- Note, that files, mentioned in parameter lines of pod proccesses are mounted into the pod from host system. You cat access them either from inside the pod or from host system, but then respecting the original file paths.
- The deployment descriptions of staic pods are located in /etc/kubernetes/manifests. Using manifests you can find out where the files acceced by pods are on node. Try it f.e. for /etc/kubernetes/static-pod-resources/configmaps/controller-manager-kubeconfig/kubeconfig